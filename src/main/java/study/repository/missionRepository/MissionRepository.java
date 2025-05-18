/**
 *   지역 기반 도전 가능한 미션
 */

package study.repository.missionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.domain.Mission;

import java.util.List;

public interface MissionRepository extends JpaRepository<Mission, Long>, MissionRepositoryCustom {
    @Query("SELECT m FROM MemberMission mm JOIN mm.mission m WHERE mm.member.id = :memberId")
    List<Mission> findAllByMemberId(@Param("memberId") Long memberId);
}
