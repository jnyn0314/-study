/**
 *   지역 기반 도전 가능한 미션
 */

package study.repository.missionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Mission;

public interface MissionRepository extends JpaRepository<Mission, Long>, MissionRepositoryCustom {
}