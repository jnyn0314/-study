package study.repository.storeRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import study.domain.QStore;
import study.domain.Review;

import java.util.Collections;
import java.util.List;

import static study.domain.QMember.member;
import static study.domain.QReview.review;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryCustomImpl implements StoreRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
    private final QStore store = QStore.store;
    private final JPAQueryFactory queryFactory;
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

    @Override
    public Page<Review> findReviewsByStoreId(Long storeId, Pageable pageable) {
        List<Review> content = queryFactory.selectFrom(review)
                .join(review.member, member).fetchJoin()
                .where(review.store.id.eq(storeId))
                .orderBy(review.createdAt.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        Long count = queryFactory.select(review.count())
                .from(review)
                .where(review.store.id.eq(storeId))
                .fetchOne();

        return new PageImpl<>(content, pageable, count);
    }
}