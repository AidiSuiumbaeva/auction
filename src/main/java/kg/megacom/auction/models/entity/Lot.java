package kg.megacom.auction.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.mapstruct.ap.internal.model.GeneratedType;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue()
    @Column(name = "lot_id")
   private Long id;
   // @NotBlank
    private String name;
    private double minPrice;
    private double maxPrice;
    private double step;

    /*@JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;*/
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Statuses statusId;

}
