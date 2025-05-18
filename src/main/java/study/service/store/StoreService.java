package study.service.store;


import study.web.dto.store.StoreCreateRequest;
import study.web.dto.store.StoreResponseDto;

public interface StoreService {
    StoreResponseDto createStore(StoreCreateRequest request);
}