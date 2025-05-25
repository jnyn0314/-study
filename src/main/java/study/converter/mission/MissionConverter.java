package study.converter.mission;

import org.springframework.data.domain.Page;
import study.domain.Mission;
import study.web.dto.mission.MissionResponseDto;

public class MissionConverter {

    public static MissionResponseDto toDto(Mission mission) {
        return MissionResponseDto.builder()
                .id(mission.getId())
                .content(mission.getContent())
                .reward(String.valueOf(mission.getReward()))
                .missionSpec(mission.getMissionSpec())
                .deadline(mission.getDeadline().atStartOfDay())
                // .missionStatus(mission.getMissionStatus().name())
                .createdAt(mission.getCreatedAt())
                .build();
    }

    public static Page<MissionResponseDto> toDtoPage(Page<Mission> missions) {
        return missions.map(MissionConverter::toDto); // stream 사용 아님
    }
}
