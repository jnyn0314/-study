package study.ApiResponse.code.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Reason {
    private final int code;
    private final String message;
}