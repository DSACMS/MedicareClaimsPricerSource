package gov.cms.fiss.pricers.ltch.api.v2.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.ltch.api.v2.LtchInpatientProviderData;

/** Validates LTCH specific fields on LtchInpatientProviderData. */
public class LtchInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidLtchInpatientProviderData, LtchInpatientProviderData> {}
