#!/usr/bin/env bash
set -euo pipefail

# Syncs each pricer repo's source tree into "<folder>/src/" in this repo.
#
# Env vars:
#   CMS_GHE_HOST   - source git host (default: github.cms.gov)
#   CMS_GHE_PAT    - token for authenticated clone (omit for anonymous/public clone, e.g. local dry runs)
#   MAPPING_FILE   - path to the repo map JSON (default: .github/sync/pricer-repo-map.json)
#   TARGET_ROOT    - repo root to write into (default: repo root, resolved from this script's location)

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"

CMS_GHE_HOST="${CMS_GHE_HOST:-github.cms.gov}"
MAPPING_FILE="${MAPPING_FILE:-$REPO_ROOT/.github/sync/pricer-repo-map.json}"
TARGET_ROOT="${TARGET_ROOT:-$REPO_ROOT}"

WORKDIR="$(mktemp -d)"
trap 'rm -rf "$WORKDIR"' EXIT

count=$(jq '.repos | length' "$MAPPING_FILE")

for i in $(seq 0 $((count - 1))); do
  folder=$(jq -r ".repos[$i].folder" "$MAPPING_FILE")
  repo=$(jq -r ".repos[$i].repo" "$MAPPING_FILE")

  if [[ -n "${CMS_GHE_PAT:-}" ]]; then
    clone_url="https://x-access-token:${CMS_GHE_PAT}@${CMS_GHE_HOST}/${repo}.git"
  else
    clone_url="https://${CMS_GHE_HOST}/${repo}.git"
  fi

  echo "== Syncing '$repo' -> '$folder/src/' =="
  clone_dir="$WORKDIR/$(basename "$repo")"
  git clone --depth 1 --quiet "$clone_url" "$clone_dir"

  dest="$TARGET_ROOT/$folder/src"
  mkdir -p "$dest"
  rsync -a --delete --exclude='.git' "$clone_dir/" "$dest/"

  rm -rf "$clone_dir"
done

echo "Done."
