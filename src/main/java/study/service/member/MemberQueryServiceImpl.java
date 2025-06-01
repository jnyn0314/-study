package study.service.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.ApiResponse.code.status.ErrorStatus;
import study.domain.Member;
import study.exception.MemberHandler;
import study.repository.member.MemberRepository;
import study.web.dto.memberInfoDTO.MemberInfoDTO;

@Service
@RequiredArgsConstructor
public class MemberQueryServiceImpl implements MemberQueryService {

    private final MemberRepository memberRepository;

    @Override
    public MemberInfoDTO getMyInfo(String email) {
        Member member = memberRepository.findByEmail(email)
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));

        return MemberInfoDTO.from(member);
    }
}