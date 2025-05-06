package study.service.memberMission;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.enums.MissionStatus;
import study.domain.mapping.MemberMission;
import study.domain.mapping.QMemberMission;
import study.repository.memberMissionRepository.MemberMissionRepositoryCustom;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberMissionRepositoryImpl implements MemberMissionRepositoryCustom {

    private final JPAQueryFactory queryFactory;
    private final QMemberMission mm = QMemberMission.memberMission;

    @Override
    public List<MemberMission> findMissionsByMemberAndStatus(Long memberId, String status, String cursor, int limit) {
        return queryFactory
                .selectFrom(mm)
                .where(mm.member.id.eq(memberId)
                        .and(mm.status.eq(MissionStatus.valueOf(status))))
                .limit(limit)
                .fetch();
    }
}
