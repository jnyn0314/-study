package study.repository.member;


import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);

    boolean existsByEmail(String email);
}