package study.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreRequestDTO {
    private String name;         // 가게 이름
    private String address;      // 가게 주소
    private String category;     // 업종
    private String phoneNumber;  // 전화번호
    // 기타 필요한 필드들
}