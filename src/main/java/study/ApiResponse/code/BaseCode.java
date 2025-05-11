package study.ApiResponse.code;

public interface BaseCode {

    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}