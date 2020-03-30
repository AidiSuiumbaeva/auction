package kg.megacom.auction.models.dto;

import kg.megacom.auction.models.entity.Statuses;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@Data
public class LotDto {
    private Long id;
    private String name;
    private double minCost;
    private double price;
    private double step;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Statuses statusId;
}
