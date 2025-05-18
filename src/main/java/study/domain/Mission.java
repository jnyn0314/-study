package study.domain;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;
import study.domain.Store;
import study.domain.common.BaseEntity;
import study.domain.mapping.MemberMission;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content; // 여기 이거 추가해야함.

    private Integer reward;

    private LocalDate deadline;

    private String missionSpec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();

    @Column(nullable = false)
    private String status;
    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", reward=" + reward +
                ", deadline=" + deadline +
                ", missionSpec='" + missionSpec + '\'' +
                ", storeId=" + (store != null ? store.getId() : null) +
                ", status='" + status + '\'' +
                '}';
    }
}