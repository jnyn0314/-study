package study.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import study.ApiResponse.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResponse<Object> handleConstraintViolation(ConstraintViolationException ex) {
        return ApiResponse.onFailure("VALIDATION_ERROR", ex.getMessage(), null); // 3개 맞춤
    }
}