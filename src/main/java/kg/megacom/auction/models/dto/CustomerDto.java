package kg.megacom.auction.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Класс Клиент",description = "Для хранения информации о клиентах")
public class CustomerDto {
    private Long id;
    @ApiModelProperty(value = "Телефон клиента")
    private String phone;
}
