package study.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.domain.Region;
import study.domain.Store;
import study.web.dto.store.StoreCreateRequest;
import study.web.dto.store.StoreResponseDto;

@Component
@RequiredArgsConstructor
public class StoreConverter {

    public Store toEntity(StoreCreateRequest request, Region region) {
        return Store.builder()
                .region(region)
                .name(request.getName())
                .address(request.getAddress())
                .addressDetail(null) // 상세주소는 별도 처리 시 추후 수정
                .score(0.0f) // 신규 가게는 평점 기본값 0.0
                .build();
    }

    public StoreResponseDto toResponse(Store store) {
        return StoreResponseDto.builder()
                .storeId(store.getId())
                .name(store.getName())
                .address(store.getAddress())
                .regionName(store.getRegion().getName())
                .regionId(store.getRegion().getId())
                .score(store.getScore())
                .createdAt(store.getCreatedAt())
                .updatedAt(store.getUpdatedAt())
                .build();
    }
}