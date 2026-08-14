package gov.cms.fiss.pricers.esrd.api.v2;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;
import java.lang.annotation.*;

/** Constrains a common working file (CWF) return code. */
@Constraint(validatedBy = {})
@Documented
@Pattern(regexp = "[1-7]0", message = "must be one of 10, 20, 30, 40, 50, 60, or 70")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface ValidCommonWorkingFileReturnCode {
  String message() default "range exceeded";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
