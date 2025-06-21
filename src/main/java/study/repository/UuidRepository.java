package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.UuidEntity;

public interface UuidRepository extends JpaRepository<UuidEntity, Long> {
}