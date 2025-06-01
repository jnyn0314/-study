package study.service;

import study.web.dto.MemberRequestDto.LoginRequestDTO;
import study.web.dto.MemberRequestDto.LoginResultDTO;
import study.domain.Member;

public interface MemberCommandService {
    LoginResultDTO loginMember(LoginRequestDTO request);
}