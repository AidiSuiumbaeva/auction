package kg.megacom.auction.repositories;

import com.sun.deploy.panel.JavaPanel;
import kg.megacom.auction.models.entity.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRep extends JpaRepository<Lot,Long> {
}
