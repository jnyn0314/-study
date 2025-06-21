package study.service;

import org.springframework.web.multipart.MultipartFile;
import study.domain.Review;
import study.web.dto.review.ReviewDTO;

public interface StoreCommandService {
    Review createReview(Long memberId, Long storeId, ReviewDTO request, MultipartFile reviewPicture);
}
