package study.ApiResponse.exception;


public class InvalidPageException extends RuntimeException {
    public InvalidPageException() {
        super("페이지 번호는 1 이상이어야 합니다.");
    }
}