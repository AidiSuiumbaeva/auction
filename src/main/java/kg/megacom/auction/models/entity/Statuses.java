package kg.megacom.auction.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statuses")
public class Statuses {
    @Id
    @GeneratedValue
    @Column(name = "status_id")
    private Long id;
    private String name;

}
