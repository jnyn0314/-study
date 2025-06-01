package study.web.dto.memberInfoDTO;

import lombok.Builder;
import lombok.Getter;
import study.domain.Member;
import study.domain.enums.Gender;
import study.domain.enums.Role;

@Getter
@Builder
public class MemberInfoDTO {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
    private Role role;

    public static MemberInfoDTO from(Member member) {
        return MemberInfoDTO.builder()
                .id(member.getId())
                .name(member.getName())
                .email(member.getEmail())
                .gender(member.getGender())
                .role(member.getRole())
                .build();
    }
}