package study.service.store;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import study.converter.review.ReviewPreViewConverter;
import study.domain.Review;
import study.domain.Store;
import study.repository.storeRepository.StoreRepository;
import study.web.dto.store.StoreResponseDto;

import java.util.List;
import java.util.Optional;

public class StoreQueryServiceImpl implements StoreQueryService {

    private final StoreRepository storeRepository;
    private final ReviewPreViewConverter reviewPreViewConverter;
    public StoreQueryServiceImpl(StoreRepository storeRepository, ReviewPreViewConverter reviewPreViewConverter) {
        this.storeRepository = storeRepository;
        this.reviewPreViewConverter = reviewPreViewConverter;
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

    @Override
        public StoreResponseDto.ReviewPreViewListDTO getReviewList(Long storeId, Integer page) {
            Pageable pageable = PageRequest.of(page - 1, 10); // page는 1부터 받는다고 가정
            Page<Review> reviewPage = storeRepository.findReviewsByStoreId(storeId, pageable);
            return reviewPreViewConverter.toListDTO(reviewPage);
        }
    }
