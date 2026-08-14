package gov.cms.fiss.pricers.esrd.api.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.esrd.api.v2.EsrdOutpatientProviderData;

/** Validates ESRD specific fields on EsrdOutpatientProviderData. */
public class EsrdOutpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidEsrdOutpatientProviderData, EsrdOutpatientProviderData> {}
