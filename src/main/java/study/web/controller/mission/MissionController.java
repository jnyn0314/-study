package study.web.controller.mission;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.ApiResponse.ApiResponse;
import study.service.mission.MissionService;
import study.validation.review.ValidPage;
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

    @Operation(summary = "특정 가게의 미션 목록 조회", description = "storeId와 page를 받아 미션 목록을 페이징 처리하여 반환합니다.")
    @GetMapping("/api/stores/{storeId}/missions")
    public ResponseEntity<ApiResponse<Page<MissionResponseDto>>> getStoreMissions(
            @PathVariable Long storeId,
            @ValidPage Pageable pageable
    ) {
        Page<MissionResponseDto> missions = missionService.getMissionsByStoreId(storeId, pageable);
        return ResponseEntity.ok(ApiResponse.onSuccess(missions));
    }
}
