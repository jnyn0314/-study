package study.validator.review;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import study.repository.storeRepository.StoreRepository;

@Component
class ExistStoreValidator implements ConstraintValidator<ExistStore, Long> {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public boolean isValid(Long storeId, ConstraintValidatorContext context) {
        if (storeId == null) return false;
        return storeRepository.existsById(storeId);
    }
}