package study.ApiResponse.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import study.ApiResponse.code.BaseCode;
import study.ApiResponse.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    _OK(HttpStatus.OK, "COMMON200", "요청에 성공하였습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .code(this.code)
                .message(this.message)
                .isSuccess(true)
                .httpStatus(this.httpStatus)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus() {
        return this.getReason(); // 성공이니까 동일한 DTO 반환
    }
}