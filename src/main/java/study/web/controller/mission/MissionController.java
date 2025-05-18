package study.web.controller.mission;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.service.mission.MissionService;
import study.web.dto.mission.MissionCreateRequest;
import study.web.dto.mission.MissionResponseDto;

@RestController
@RequestMapping("/api/missions")
@RequiredArgsConstructor
public class MissionController {

    private final MissionService missionService;

    @PostMapping
    public ResponseEntity<MissionResponseDto> create(@RequestBody @Valid MissionCreateRequest request) {
        MissionResponseDto response = missionService.createMission(request);
        return ResponseEntity.ok(response);
    }
}
