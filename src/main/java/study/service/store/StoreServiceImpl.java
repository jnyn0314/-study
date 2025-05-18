package study.service.store;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.ApiResponse.code.status.ErrorStatus;
import study.converter.StoreConverter;
import study.domain.Region;
import study.domain.Store;
import study.web.dto.store.StoreCreateRequest;
import study.web.dto.store.StoreResponseDto;
import study.ApiResponse.exception.GeneralException;
import study.repository.region.RegionRepository;
import study.repository.storeRepository.StoreRepository;
import study.service.store.StoreService;

@Service
@RequiredArgsConstructor
@Transactional
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;
    private final StoreConverter storeConverter;

    @Override
    public StoreResponseDto createStore(StoreCreateRequest request) {
        // region 조회
        Region region = regionRepository.findById(request.getRegionId())
                .orElseThrow(() -> new GeneralException(ErrorStatus.REGION_NOT_FOUND));

        // Store 생성
        Store store = storeConverter.toEntity(request, region);
        Store saved = storeRepository.save(store);

        // 응답 변환
        return storeConverter.toResponse(saved);
    }
}