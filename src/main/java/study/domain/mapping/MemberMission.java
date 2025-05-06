package study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;
import study.domain.Member;
import study.domain.Mission;
import study.domain.Terms;
import study.domain.common.BaseEntity;
import study.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terms_id")
    private Terms terms;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY) // 하나의 mission에 대해서 여러개의 memberMission
    @JoinColumn(name = "mission_id") // FK (MemberMission)
    private Mission mission; // mission 필드 추가
    @Override
    public String toString() {
        return "MemberMission{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}