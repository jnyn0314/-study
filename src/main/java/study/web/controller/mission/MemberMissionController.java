package study.web.controller.mission;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.service.memberMission.MemberMissionService;
import study.web.dto.mission.MissionChallengeRequest;
import study.web.dto.mission.MissionChallengeResponse;

@RestController
@RequestMapping("/api/member-missions")
@RequiredArgsConstructor
public class MemberMissionController {

    private final MemberMissionService memberMissionService;

    @PostMapping("/challenge")
    public ResponseEntity<MissionChallengeResponse> challengeMission(@RequestBody @Valid MissionChallengeRequest request) {
        MissionChallengeResponse response = memberMissionService.challengeMission(request);
        return ResponseEntity.ok(response);
    }
}