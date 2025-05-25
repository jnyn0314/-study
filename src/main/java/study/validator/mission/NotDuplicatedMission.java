package study.validator.mission;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NotDuplicatedMissionValidator.class)
@Target(ElementType.TYPE) // DTO 클래스에 붙이기 위해 TYPE 사용
@Retention(RetentionPolicy.RUNTIME)
public @interface NotDuplicatedMission {
    String message() default "이미 도전 중인 미션입니다.";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}