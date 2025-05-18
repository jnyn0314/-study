package study.repository.member;


import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}