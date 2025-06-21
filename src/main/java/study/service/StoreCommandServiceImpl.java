package study.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import study.domain.Review;
import study.web.dto.review.ReviewDTO;

@Service
public class StoreCommandServiceImpl implements StoreCommandService {
    public Review createReview(Long memberId, Long storeId, ReviewDTO request, MultipartFile reviewPicture) {
        return null;
    }
}