package kg.megacom.auction.service;

import kg.megacom.auction.models.dto.LotDto;
import kg.megacom.auction.models.entity.Lot;

public interface LotService {
    LotDto save(LotDto lotDto);
}
