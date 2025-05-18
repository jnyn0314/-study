package study.repository.storeRepository;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Object> dynamicQueryWithBooleanBuilder(String name, Float score);
}