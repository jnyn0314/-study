package study.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import study.ApiResponse.ApiResponse;
import study.ApiResponse.code.status.ErrorStatus;
import study.ApiResponse.exception.InvalidPageException;
@RestControllerAdvice
public class GlobalExceptionHandler {


    /**
     * Bean Validation (예: @NotNull, @Size 등)에 실패했을 때 발생
     * 예시: @RequestParam, @PathVariable 등에 제약 위반
     * ex) /api/members?page=abc → 숫자 기대했는데 문자열 들어옴
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResponse<Object> handleConstraintViolation(ConstraintViolationException ex) {
        return ApiResponse.onFailure("VALIDATION_ERROR", ex.getMessage(), null); // 3개 맞춤
    }

    /**
     * 커스텀 페이지 유효성 검증 실패 시 발생
     * 예시: ?page=0 → @ValidPage에서 강제로 던진 InvalidPageException
     */
    @ExceptionHandler(InvalidPageException.class)
    public ResponseEntity<ApiResponse<?>> handleInvalidPage(InvalidPageException ex) {
        return ResponseEntity
                .badRequest()
                .body(ApiResponse.of(ErrorStatus.INVALID_PAGE, null));
    }

    /**
     * 요청 파라미터가 잘못된 경우에 대한 일반적인 처리
     * 예시: 존재하지 않는 미션 ID, memberId 등으로 요청한 경우
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponse<?>> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ApiResponse.onFailure("400", ex.getMessage(), null));
    }


    /**
     * 상태상 허용되지 않는 요청일 때 발생
     * 예시: 이미 완료된 미션을 또 완료하려고 할 때
     */
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ApiResponse<?>> handleIllegalState(IllegalStateException ex) {
        return ResponseEntity.badRequest().body(ApiResponse.onFailure("400", ex.getMessage(), null));
    }
}