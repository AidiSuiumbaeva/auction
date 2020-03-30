package kg.megacom.auction.repositories;

import kg.megacom.auction.models.entity.Bids;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRep extends JpaRepository<Bids,Long> {
}
