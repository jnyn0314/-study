package study.web.dto.store;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreCreateRequest {

    @NotNull(message = "지역 ID는 필수입니다.")
    private Long regionId;

    @NotBlank(message = "가게 이름은 필수입니다.")
    private String name;

    @NotBlank(message = "주소는 필수입니다.")
    private String address;
}
