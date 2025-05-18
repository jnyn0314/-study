package study.ApiResponse.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import study.ApiResponse.code.BaseErrorCode;
import study.ApiResponse.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}