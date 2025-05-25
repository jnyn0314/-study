package study.web.controller.review;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import study.ApiResponse.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.config.resolver.annotation.CurrentMember;
import study.converter.review.ReviewConverter;
import study.domain.Member;
import study.domain.Review;
import study.repository.member.MemberRepository;
import study.service.review.ReviewQueryService;
import study.validation.review.ValidPage;
import study.web.dto.review.MyReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/members")
public class MemberReviewController {

    private final ReviewQueryService reviewQueryService;
    private final MemberRepository memberRepository;

    @GetMapping("/me/reviews")
    @Operation(summary = "내가 작성한 리뷰 목록 조회", description = "현재 로그인한 사용자의 리뷰를 페이징 처리하여 조회합니다.")
    @ApiResponses({
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "COMMON200",
                    description = "OK"
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "AUTH003",
                    description = "access 토큰을 주세요!",
                    content = @Content(schema = @Schema(implementation = study.ApiResponse.ApiResponse.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "AUTH004",
                    description = "access 토큰 만료",
                    content = @Content(schema = @Schema(implementation = study.ApiResponse.ApiResponse.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "AUTH006",
                    description = "access 토큰 모양이 이상함",
                    content = @Content(schema = @Schema(implementation = study.ApiResponse.ApiResponse.class))
            )
    })

    @Parameters({
            @Parameter(name = "page", description = "조회할 페이지 번호 (1부터 시작)", required = true)
    })
    public ApiResponse<MyReviewResponseDTO> getMyReviews(
            @ValidPage @RequestParam(name = "page") Integer page
            //@Parameter(hidden = true) // swager에 노출안되려면
           //  @CurrentMember Member member // 현재 로그인한 사용자 주입 (커스텀 어노테이션 사용 시)
    ) {

        // 테스트용 강제 주입 (Swagger에서만 사용)
        Member member = memberRepository.findAll().stream().findFirst()
                .orElseThrow(() -> new IllegalStateException("멤버가 없습니다."));

        // 1. Service에서 리뷰 페이지 조회
        Page<Review> reviewPage = reviewQueryService.getMyReviews(member, page - 1); // Spring Data는 0부터 시작

        // 2. Entity → DTO 변환
        MyReviewResponseDTO responseDTO = ReviewConverter.toMyReviewResponseDTO(reviewPage);

        // 3. API 응답 Wrapping
        return ApiResponse.onSuccess(responseDTO);
    }


}

