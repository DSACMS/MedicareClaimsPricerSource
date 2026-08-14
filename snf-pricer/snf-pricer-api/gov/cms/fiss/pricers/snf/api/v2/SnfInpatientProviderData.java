package gov.cms.fiss.pricers.snf.api.v2;

import gov.cms.fiss.pricers.common.api.InpatientProviderData;
import gov.cms.fiss.pricers.snf.api.validation.ValidSnfInpatientProviderData;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    description =
        "Inpatient provider-specific data used in claim price calculations. Entries become valid on the date indicated in the `effectiveDate` field and remain in effect until superseded by an entry with a later effective date.",
    requiredProperties = {"cbsaActualGeographicLocation", "federalPpsBlend", "vbpAdjustment"})
@ValidSnfInpatientProviderData
public class SnfInpatientProviderData extends InpatientProviderData {}
