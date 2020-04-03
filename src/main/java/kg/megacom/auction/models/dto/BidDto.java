package kg.megacom.auction.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kg.megacom.auction.models.entity.Customers;
import kg.megacom.auction.models.entity.Lot;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@ApiModel(value = "Класс Ставка",description = "Для хранения информации о ставках")
public class BidDto {
    private Long id;
    private Date addDate;
    private double bidValue;
    @ApiModelProperty(value = "Активен или не активен")
    private boolean active;
    @ApiModelProperty(value = "На какой лот ставка")
    private LotDto lotDto;
    @ApiModelProperty(value = "Информация о клиенте ")
    private CustomerDto customerDto;
}
