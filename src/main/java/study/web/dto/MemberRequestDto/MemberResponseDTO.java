package study.web.dto.MemberRequestDto;


import lombok.AllArgsConstructor;
import lombok.Getter;

public class MemberResponseDTO {

    @Getter
    @AllArgsConstructor
    public static class LoginResultDTO {
        private String email;
        private String token;
    }
}
