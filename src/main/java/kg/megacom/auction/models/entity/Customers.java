package kg.megacom.auction.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Long id;
    private String phone;
}
