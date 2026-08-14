# IPPS Pricer Source (Java)

CMS makes the Inpatient Prospective Payment System (IPPS) Pricer source code available to the public to fulfill Freedom of Information Act (FOIA) requests, and facilitate Medicare pricing methodology
and rate transparency.The source code and data files provided are meant to show pricing methodology and rates, respectively. CMS does not provide technical support to incorporate this source code into
new or existing systems outside of its Original Medicare claims processing system. The Java source code is packaged as a `ZIP` file for convenience.

## Source Directory Structure

The IPPS Pricer is organized as a [standard Maven project](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html). Within that structure, the classes are
defined and packaged using the [standard Dropwizard conventions](https://www.dropwizard.io/en/latest/manual/core.html#organizing-your-project).

The root package is `gov.cms.fiss.pricers.ipps`, and the source directory structure reflects the package structure. All folders referenced here are below this
root (`src/main/java/gov/cms/fiss/pricers/ipps`). The pricer logic itself lives in the package `gov.cms.fiss.pricers.ipps.core`. This directory contains the Java translated from the original COBOL
listing.

The following packages are used in IPPS:

- `gov.cms.fiss.pricers.ipps` - Defines the pricer application infrastructure
- `gov.cms.fiss.pricers.ipps.api` - Defines the pricer API contract (inputs/outputs)
- `gov.cms.fiss.pricers.ipps.core` - The package containing all the pricing logic
- `gov.cms.fiss.pricers.ipps.core.rules` - Contains business rules; sub-packages used for grouping by year and category
- `gov.cms.fiss.pricers.ipps.core.tables` - Loads static (CSV) data for lookups
- `gov.cms.fiss.pricers.ipps.resources` - Defines the pricer API endpoint

## Additional Files

The static data used to cross-reference claim information (such as rate lookups) is provided as CSV files in the root of the `ZIP` archive.
