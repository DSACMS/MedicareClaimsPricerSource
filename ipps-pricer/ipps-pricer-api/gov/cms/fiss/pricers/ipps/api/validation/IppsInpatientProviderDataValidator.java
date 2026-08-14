package gov.cms.fiss.pricers.ipps.api.validation;

import gov.cms.fiss.pricers.common.api.validation.SchemaRequiredPropertiesValidator;
import gov.cms.fiss.pricers.ipps.api.v2.IppsInpatientProviderData;

/** Validates IPPS specific fields on IppsInpatientProviderData */
public class IppsInpatientProviderDataValidator
    implements SchemaRequiredPropertiesValidator<
        ValidIppsInpatientProviderData, IppsInpatientProviderData> {}
