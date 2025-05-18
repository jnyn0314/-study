package study.repository.region;


import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
    // 필요한 경우 여기에 custom 메서드 추가 가능
}
