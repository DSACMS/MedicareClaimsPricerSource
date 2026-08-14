package gov.cms.fiss.pricers.snf.api.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.snf.api.v2.SnfInpatientProviderData;

/** Validates SNF specific fields on SnfInpatientProviderData. */
public class SnfInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidSnfInpatientProviderData, SnfInpatientProviderData> {}
