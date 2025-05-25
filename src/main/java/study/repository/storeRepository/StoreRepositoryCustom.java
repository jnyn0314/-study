package study.repository.storeRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.domain.Review;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Object> dynamicQueryWithBooleanBuilder(String name, Float score);
    Page<Review> findReviewsByStoreId(Long storeId, Pageable pageable);

}