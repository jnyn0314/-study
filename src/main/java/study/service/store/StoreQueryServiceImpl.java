package study.service.store;

import study.domain.Store;
import study.repository.storeRepository.StoreRepository;

import java.util.List;
import java.util.Optional;

public class StoreQueryServiceImpl implements StoreQueryService {

    private final StoreRepository storeRepository;

    public StoreQueryServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Optional<Store> findStore(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public List<Object> findStoresByNameAndScore(String name, Float score) {
        List<Object> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(name, score);

        filteredStores.forEach(store -> System.out.println("Store: " + store));

        return filteredStores;
    }
}