package study.validator.review;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import study.validation.review.ValidPage;

public class ValidPageValidator implements ConstraintValidator<ValidPage, Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value != null && value >= 1;
    }
}