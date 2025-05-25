package study.web.controller.store;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import study.ApiResponse.ApiResponse;
import study.service.store.StoreQueryService;
import study.validator.review.ExistStore;
import study.web.dto.store.StoreResponseDto;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/stores")
public class StoreRestController {

    private final StoreQueryService storeQueryService;

    @GetMapping("/{storeId}/reviews")
    @Operation(summary = "특정 가게의 리뷰 목록 조회 API", description = "특정 가게의 리뷰들을 페이징해서 조회합니다. page는 1부터 시작합니다.")
    public ApiResponse<StoreResponseDto.ReviewPreViewListDTO> getReviewList(
            @PathVariable(name = "storeId") Long storeId,
            @RequestParam(name = "page") @Min(value = 1, message = "{review.page.min}") Integer page) {

        StoreResponseDto.ReviewPreViewListDTO response = storeQueryService.getReviewList(storeId, page);
        return ApiResponse.onSuccess(response);
    }
}