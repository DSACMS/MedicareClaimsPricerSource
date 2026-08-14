package gov.cms.fiss.pricers.esrd.api.v2;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Constrains a comorbidity code. */
@Constraint(validatedBy = {})
@Documented
@Pattern(regexp = "M[ACDE]", message = "must be one of 'MA', 'MC', 'MD', or 'ME'")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface ValidComorbidityCode {
  String message() default "range exceeded";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
