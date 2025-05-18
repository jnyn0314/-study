package study.web.dto.store;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class StoreResponseDto {

    private Long storeId;
    private String name;
    private String address;
    private String regionName;
    private Long regionId;
    private Float score;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}