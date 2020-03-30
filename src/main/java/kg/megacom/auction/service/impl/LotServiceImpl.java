package kg.megacom.auction.service.impl;

import kg.megacom.auction.mappers.ClassMappers;
import kg.megacom.auction.models.dto.LotDto;
import kg.megacom.auction.models.entity.Lot;
import kg.megacom.auction.repositories.LotRep;
import kg.megacom.auction.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotServiceImpl implements LotService {
@Autowired
private LotRep lotRep;

    @Override
    public LotDto save(LotDto lotDto) {
        Lot lot= ClassMappers.INSTANCE.lotDtoToLot(lotDto);
       lotRep.save(lot);
        lotDto=ClassMappers.INSTANCE.lotToLotDto(lot);
        return lotDto;
    }
}
