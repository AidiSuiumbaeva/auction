package kg.megacom.auction.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kg.megacom.auction.models.entity.Statuses;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Data
@ApiModel(value = "Класс Лот",description = "Для хранения информации о лотах")
public class LotDto {
    private Long id;
    private String name;
    @ApiModelProperty(value = "Минимальная стоимость лота")
    private double minCost;
    @ApiModelProperty(value = "Цена лота")
    private double price;
    @ApiModelProperty(value = "Шаг ")
    private double step;
    @ApiModelProperty(value = "Статус лота")
    private StatusDto statusIdDto;
}
