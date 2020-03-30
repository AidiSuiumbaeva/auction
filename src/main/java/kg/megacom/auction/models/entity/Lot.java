package kg.megacom.auction.models.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue
    @Column(name = "lot_id")
   private Long id;
    @NotBlank
    private String name;
    private double minPrice;
    private double maxPrice;
    private double step;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Statuses statusId;

}
