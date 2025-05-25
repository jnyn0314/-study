package study.config.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
public class SecurityUtil {
/*
    public static String getCurrentMemberEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            throw new RuntimeException("인증 정보가 없습니다.");
        }
        return authentication.getName(); // 또는 커스텀 유저정보에서 getEmail()
    }


 */

    public static String getCurrentMemberEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()
                || "anonymousUser".equals(authentication.getPrincipal())) {
            // Swagger 테스트용 fallback (실서비스에선 제거)
            System.out.println("[WARN] 인증 정보 없음, 테스트용 fallback 이메일 반환");
            return "test@example.com"; // 반드시 DB에 존재하는 이메일로!
        }

        return authentication.getName(); // 실 서비스에서는 여기서 이메일 반환
    }

}