package gov.cms.fiss.pricers.opps.api.v2;

import gov.cms.fiss.pricers.common.api.OutpatientProviderData;
import gov.cms.fiss.pricers.opps.api.v2.validation.ValidOppsOutpatientProviderData;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    description =
        "Outpatient provider-specific data used in claim price calculations. Entries become valid on the date "
            + "indicated in the `effectiveDate` field and remain in effect until superseded by an entry with a "
            + "later effective date.",
    requiredProperties = {
      "cbsaActualGeographicLocation",
      "fiscalYearBeginDate",
      "stateCode",
      "operatingCostToChargeRatio",
      "countyCode"
    })
@ValidOppsOutpatientProviderData
public class OppsOutpatientProviderData extends OutpatientProviderData {}
