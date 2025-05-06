package study.repository.storeRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.QStore;

import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryCustomImpl implements StoreRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
    private final QStore store = QStore.store;

    @Override
    public List<Object> dynamicQueryWithBooleanBuilder(String name, Float score) {
        BooleanBuilder predicate = new BooleanBuilder();

        if (name != null) {
            predicate.and(store.name.eq(name));
        }

        if (score != null) {
            predicate.and(store.score.goe(4.0f));
        }

        return Collections.singletonList(jpaQueryFactory
                .selectFrom(store)
                .where(predicate)
                .fetch());
    }
}