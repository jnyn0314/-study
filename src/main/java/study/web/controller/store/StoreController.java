package study.web.controller.store;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.web.dto.store.StoreCreateRequest;
import study.web.dto.store.StoreResponseDto;
import study.service.store.StoreService;

@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @PostMapping
    public ResponseEntity<StoreResponseDto> createStore(@RequestBody @Valid StoreCreateRequest request) {
        StoreResponseDto response = storeService.createStore(request);
        return ResponseEntity.ok(response);
    }
}