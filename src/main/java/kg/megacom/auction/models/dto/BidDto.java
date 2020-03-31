package kg.megacom.auction.models.dto;

import kg.megacom.auction.models.entity.Customers;
import kg.megacom.auction.models.entity.Lot;
import lombok.Data;

import java.time.LocalDate;
@Data
public class BidDto {
    private Long id;
    private LocalDate addDate;
    private double bidValue;
    private boolean active;
    private Lot lotDto;
    private Customers customerDto;
}
