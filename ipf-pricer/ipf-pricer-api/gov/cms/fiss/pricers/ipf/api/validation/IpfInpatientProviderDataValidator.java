package gov.cms.fiss.pricers.ipf.api.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.ipf.api.v2.IpfInpatientProviderData;

/** Validates IPF specific fields on IpfInpatientProviderData */
public class IpfInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidIpfInpatientProviderData, IpfInpatientProviderData> {}
