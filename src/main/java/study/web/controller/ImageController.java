package study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import study.domain.Review;
import study.service.StoreCommandService;
import study.web.dto.review.ReviewDTO;

@RestController
@RequestMapping("/stores")
@RequiredArgsConstructor
public class ImageController {

    private final StoreCommandService storeCommandService;

    @PostMapping(value = "/{storeId}/reviews", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createReview(
            @PathVariable Long storeId,
            @RequestPart("request") ReviewDTO request,
            @RequestPart(value = "reviewPicture", required = false) MultipartFile reviewPicture,
            @RequestParam Long memberId // 임시용: 실제로는 SecurityContext 등에서 꺼내야 함
    ) {
        Review review = storeCommandService.createReview(memberId, storeId, request, reviewPicture);
        return ResponseEntity.ok(review.getId());
    }
}
