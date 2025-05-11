package study.ApiResponse.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorReasonDTO {

    private HttpStatus httpStatus;
    private boolean isSuccess;
    private String code;
    private String message;
}
