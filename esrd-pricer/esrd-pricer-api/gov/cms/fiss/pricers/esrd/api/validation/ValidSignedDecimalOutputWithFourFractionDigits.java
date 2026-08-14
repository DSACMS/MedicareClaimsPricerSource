package gov.cms.fiss.pricers.esrd.api.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Provides a convenience annotation for signed decimal output fields that only allow two decimal
 * places.
 */
@DecimalMin("-99999999999999999999.9999")
@DecimalMax("99999999999999999999.9999")
@Digits(integer = 20, fraction = 4)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {})
public @interface ValidSignedDecimalOutputWithFourFractionDigits {

  String message() default "range exceeded";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
