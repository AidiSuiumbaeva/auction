package kg.megacom.auction.repositories;

import kg.megacom.auction.models.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRep extends JpaRepository<Statuses,Long> {

}
