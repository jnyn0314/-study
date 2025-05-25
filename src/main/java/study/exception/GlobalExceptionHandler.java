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

    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResponse<Object> handleConstraintViolation(ConstraintViolationException ex) {
        return ApiResponse.onFailure("VALIDATION_ERROR", ex.getMessage(), null); // 3개 맞춤
    }

    @ExceptionHandler(InvalidPageException.class)
    public ResponseEntity<ApiResponse<?>> handleInvalidPage(InvalidPageException ex) {
        return ResponseEntity
                .badRequest()
                .body(ApiResponse.of(ErrorStatus.INVALID_PAGE, null));
    }

}