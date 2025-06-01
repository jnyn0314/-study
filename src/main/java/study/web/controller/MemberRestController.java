package study.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import study.ApiResponse.ApiResponse;
import study.service.member.MemberCommandService;
import study.service.member.MemberQueryService;
import study.web.dto.MemberRequestDto.LoginRequestDTO;
import study.web.dto.MemberRequestDto.LoginResultDTO;
import study.web.dto.memberInfoDTO.MemberInfoDTO;

@Tag(name = "member-rest-controller", description = "회원 관련 API")
@RestController
@RequestMapping("/members")  // 루트 URL 지정
@RequiredArgsConstructor
public class MemberRestController {

    private final MemberCommandService memberCommandService;
    private final MemberQueryService memberQueryService;

    @PostMapping("/login")
    @Operation(summary = "유저 로그인 API", description = "유저가 로그인하는 API입니다.")
    public ApiResponse<LoginResultDTO> login(@RequestBody @Valid LoginRequestDTO request) {
        return ApiResponse.onSuccess(memberCommandService.loginMember(request));
    }

    @PostMapping("/join")
    @Operation(summary = "유저 회원가입 API", description = "유저가 회원가입하는 API입니다.")
    public ApiResponse<?> join(@RequestBody @Valid study.web.dto.MemberRequestDTO.JoinDto request) {
        memberCommandService.joinMember(request);
        return ApiResponse.onSuccess("회원가입 성공");
    }

    @GetMapping("/info")
    @Operation(summary = "내 정보 조회 API", description = "JWT 토큰 기반으로 로그인한 사용자의 정보를 조회합니다.")
    public ApiResponse<MemberInfoDTO> getMyInfo(Authentication authentication) {
        String email = authentication.getName(); // JWT에서 subject = email
        return ApiResponse.onSuccess(memberQueryService.getMyInfo(email));
    }

}