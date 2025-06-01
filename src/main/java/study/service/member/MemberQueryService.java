package study.service.member;


import study.web.dto.memberInfoDTO.MemberInfoDTO;

public interface MemberQueryService {
    MemberInfoDTO getMyInfo(String email);
}