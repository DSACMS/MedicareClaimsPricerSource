package gov.cms.fiss.pricers.opps.api.v2.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.opps.api.v2.OppsOutpatientProviderData;

/** Validates OPPS specific fields on OppsOutpatientProviderData. */
public class OppsOutpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidOppsOutpatientProviderData, OppsOutpatientProviderData> {}
