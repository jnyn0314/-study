package study.repository.missionRepository;

import com.querydsl.core.types.Expression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.Mission;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import study.domain.Mission;
import study.domain.QMission;
import study.domain.QRegion;

@Repository
@RequiredArgsConstructor
public class MissionRepositoryCustomImpl implements MissionRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Mission> findAvailableMissionsByRegion(String regionName, String cursor, int limit) {
        QMission mission = QMission.mission;
        QRegion region = QRegion.region;

        return queryFactory
                .selectFrom(mission)
                .join(mission.store.region, region)
                .where(
                        region.name.eq(regionName),
                        mission.status.eq("도전이 가능함"),
                        cursorCondition(cursor, mission)
                )
                .orderBy(mission.createdAt.desc(), mission.id.desc())
                .limit(limit)
                .fetch();
    }

    private com.querydsl.core.types.dsl.BooleanExpression cursorCondition(String cursor, QMission mission) {
        if (cursor == null || cursor.isEmpty()) return null;

        long cursorTime = Long.parseLong(cursor.substring(0, 10));
        long cursorId = Long.parseLong(cursor.substring(10));
        return mission.createdAt.lt((Expression<LocalDateTime>) new Timestamp(cursorTime * 1000))
                .or(mission.createdAt.eq((Expression<? super LocalDateTime>) new Timestamp(cursorTime * 1000)).and(mission.id.lt(cursorId)));
    }
}
