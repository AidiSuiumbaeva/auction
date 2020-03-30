package kg.megacom.auction.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "bids")
public class Bids {
    @Id
    @GeneratedValue
    @Column(name = "bid_id")
    private Long id;

    private LocalDate addDate;
    private double bidValue;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;
}
