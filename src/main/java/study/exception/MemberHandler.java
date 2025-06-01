package study.exception;

import study.ApiResponse.code.status.ErrorStatus;

public class MemberHandler extends RuntimeException {

    private final ErrorStatus errorStatus;

    public MemberHandler(ErrorStatus errorStatus) {
        super(errorStatus.getMessage()); // 메시지 전달
        this.errorStatus = errorStatus;
    }

    public ErrorStatus getErrorStatus() {
        return errorStatus;
    }
}