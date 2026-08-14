package gov.cms.fiss.pricers.hha.api.v2.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.hha.api.v2.HhaInpatientProviderData;

/** Validates HHA specific fields on HhaInpatientProviderData. */
public class HhaInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidHhaInpatientProviderData, HhaInpatientProviderData> {}
