package kg.megacom.auction.controllers;

import kg.megacom.auction.models.dto.BidDto;
import kg.megacom.auction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bid")

public class BidController {
    @Autowired
    private BidService service;

    @PostMapping(value = "/save")
    public BidDto save(@RequestBody BidDto bidDto){
        return service.save(bidDto);
    }
}
