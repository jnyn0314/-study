/**
 * QueryDSL 구현체
 */
package study.repository.memberMissionRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.enums.MissionStatus;
import study.domain.mapping.MemberMission;
import study.domain.mapping.QMemberMission;
//import study.domain.mapping.QMemberMission;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberMissionRepositoryImpl implements MemberMissionRepositoryCustom {

    private final JPAQueryFactory queryFactory;
    private final QMemberMission mm = QMemberMission.memberMission;

    /**
     * 커서 기반 미션 리스트 조회
     */
    @Override
    public List<MemberMission> findMissionsByMemberAndStatus(Long memberId, String status, String cursor, int limit) {
        return queryFactory
                .selectFrom(mm)
                .where(
                        mm.member.id.eq(memberId),
                        mm.status.eq(MissionStatus.valueOf(status)),
                        (cursor != null && !cursor.isBlank()) ? mm.id.gt(Long.parseLong(cursor)) : null
                )
                .orderBy(mm.id.asc())
                .limit(limit)
                .fetch();
    }

    /**
     * 중복 도전 여부 확인
     */
    @Override
    public boolean existsByMemberIdAndMissionIdAndStatus(Long memberId, Long missionId, String status) {
        Integer result = queryFactory
                .selectOne()
                .from(mm)
                .where(
                        mm.member.id.eq(memberId),
                        mm.mission.id.eq(missionId),
                        mm.status.eq(MissionStatus.valueOf(status))
                )
                .fetchFirst();

        return result != null;
    }

    /**
     * 특정 memberMissionId 로 단일 조회
     */
    @Override
    public Optional<Object> findMissionsByMemberAndStatus(Long memberMissionId) {
        MemberMission result = queryFactory
                .selectFrom(mm)
                .where(mm.id.eq(memberMissionId))
                .fetchFirst();

        return Optional.ofNullable(result).map(m -> (Object) m);
    }
}
