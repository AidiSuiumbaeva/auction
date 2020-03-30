package kg.megacom.auction.repositories;

import kg.megacom.auction.models.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRep extends JpaRepository<Customers,Long> {
}
