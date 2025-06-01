package study.converter;

import study.domain.Member;
import study.domain.enums.Gender;
import study.web.dto.MemberRequestDTO;
import study.web.dto.MemberRequestDto.LoginResultDTO;

import java.util.ArrayList;

public class MemberConverter {
    public static Member toMember(MemberRequestDTO.JoinDto request) {
        Gender gender = null;
        switch (request.getGender()) {
            case 1: gender = Gender.MALE; break;
            case 2: gender = Gender.FEMALE; break;
            // case 3: gender = Gender.NONE; break;
        }

        return Member.builder()
                .name(request.getName())
                .email(request.getEmail())   // 추가된 코드
                // .password(request.getPassword())   // 추가된 코드
                .gender(gender)
                .address(request.getAddress())
                .specAddress(request.getSpecAddress())
                .role(request.getRole())   // 추가된 코드
                .memberPreferList(new ArrayList<>())
                .build();
    }

    public static LoginResultDTO toLoginResultDTO(Long memberId, String accessToken) {
        return LoginResultDTO.builder()
                .memberId(memberId)
                .accessToken(accessToken)
                .build();
    }
}