package gov.cms.fiss.pricers.irf.api.v2;

import gov.cms.fiss.pricers.common.api.InpatientProviderData;
import gov.cms.fiss.pricers.irf.api.validation.ValidIrfInpatientProviderData;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    description =
        "Inpatient provider-specific data used in claim price calculations. "
            + "Entries become valid on the date indicated in the `effectiveDate` field and remain in "
            + "effect until superseded by an entry with a later effective date.",
    requiredProperties = {
      "capitalIndirectMedicalEducationRatio",
      "cbsaActualGeographicLocation",
      "fiscalYearBeginDate",
      "medicaidRatio",
      "operatingCostToChargeRatio",
      "ppsFacilitySpecificRate",
      "supplementalSecurityIncomeRatio",
      "waiverIndicator"
    })
@ValidIrfInpatientProviderData
public class IrfInpatientProviderData extends InpatientProviderData {}
