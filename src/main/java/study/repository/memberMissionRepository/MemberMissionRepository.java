package study.repository.memberMissionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.mapping.MemberMission;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long>, MemberMissionRepositoryCustom {
}