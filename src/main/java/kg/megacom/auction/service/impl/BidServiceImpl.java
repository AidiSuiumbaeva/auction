package kg.megacom.auction.service.impl;

import kg.megacom.auction.mappers.ClassMappers;
import kg.megacom.auction.models.dto.BidDto;
import kg.megacom.auction.models.entity.Bids;
import kg.megacom.auction.repositories.BidRep;
import kg.megacom.auction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {
    @Autowired
    private BidRep bidRep;
    @Override
    public BidDto save(BidDto bidDto) {
        Bids bids= ClassMappers.INSTANCE.bidDtoToBids(bidDto);
        bidRep.save(bids);
        System.out.println(bidDto);
        bidDto=ClassMappers.INSTANCE.bidsToBidDto(bids);
        System.out.println(bids);
        return bidDto;

    }
}
