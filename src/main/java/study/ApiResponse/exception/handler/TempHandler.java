package study.ApiResponse.exception.handler;

import study.ApiResponse.code.BaseErrorCode;
import study.ApiResponse.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}