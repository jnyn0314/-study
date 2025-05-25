package study.service.store;

import study.domain.Store;
import study.web.dto.store.StoreResponseDto;

import java.util.List;
import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    List<Object> findStoresByNameAndScore(String name, Float score);
    StoreResponseDto.ReviewPreViewListDTO getReviewList(Long storeId, Integer page);
}