// ReviewRepository.java
package study.repository.reviewRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Member;
import study.domain.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    List<Review> findByMember_Id(Long memberId);
    Page<Review> findAllByMember(Member member, Pageable pageable);
}
