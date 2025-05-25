package study.validation.review;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import study.validator.review.ValidPageValidator;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidPageValidator.class)
@Documented
public @interface ValidPage {
    String message() default "페이지 번호는 1 이상이어야 합니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}