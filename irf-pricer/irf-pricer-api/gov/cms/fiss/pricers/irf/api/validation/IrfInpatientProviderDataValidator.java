package gov.cms.fiss.pricers.irf.api.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.irf.api.v2.IrfInpatientProviderData;

/** Validates IRF specific fields on IrfInpatientProviderData */
public class IrfInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidIrfInpatientProviderData, IrfInpatientProviderData> {}
