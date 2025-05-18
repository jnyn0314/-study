package study.validator.review;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = ExistStoreValidator.class)
@Target({ FIELD })
@Retention(RUNTIME)
public @interface ExistStore {

    String message() default "존재하지 않는 가게입니다.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}