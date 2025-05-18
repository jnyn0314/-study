package study.domain;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;
import study.domain.common.BaseEntity;
import study.domain.mapping.MemberPrefer;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
        private List<MemberPrefer> memberPreferList = new ArrayList<>();
    }


