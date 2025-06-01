package study.service.member;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import study.domain.Member;
import study.repository.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberCommandService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void join(MemberJoinDto dto) {
        // 이메일 중복 검사
        if (memberRepository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }

        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(dto.getPassword());

        // Member 엔티티 생성
        Member member = Member.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(encodedPassword)
                .gender(dto.getGender())
                .birthYear(dto.getBirthYear())
                .birthMonth(dto.getBirthMonth())
                .birthDay(dto.getBirthDay())
                .address(dto.getAddress())
                .specAddress(dto.getSpecAddress())
                .role(dto.getRole() != null ? dto.getRole() : MemberRole.USER)
                .build();

        memberRepository.save(member);
    }
}