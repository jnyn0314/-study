package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Terms;

public interface TermsRepository extends JpaRepository<Terms, Long> {
}
