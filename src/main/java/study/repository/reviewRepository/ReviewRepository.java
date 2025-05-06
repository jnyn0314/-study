// ReviewRepository.java
package study.repository.reviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
}
