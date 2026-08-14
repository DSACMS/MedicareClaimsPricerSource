package gov.cms.fiss.pricers.ipf.api.v2;

import gov.cms.fiss.pricers.common.api.InpatientProviderData;
import gov.cms.fiss.pricers.ipf.api.validation.ValidIpfInpatientProviderData;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    description =
        "Inpatient provider-specific data used in claim price calculations. "
            + "Entries become valid on the date indicated in the `effectiveDate` field and remain "
            + "in effect until superseded by an entry with a later effective date.",
    requiredProperties = {
      "bedSize",
      "cbsaActualGeographicLocation",
      "costOfLivingAdjustment",
      "fiscalYearBeginDate",
      "internsToBedsRatio",
      "medicaidRatio",
      "operatingCostToChargeRatio",
      "specialWageIndex",
      "supplementalSecurityIncomeRatio",
    })
@ValidIpfInpatientProviderData
public class IpfInpatientProviderData extends InpatientProviderData {}
