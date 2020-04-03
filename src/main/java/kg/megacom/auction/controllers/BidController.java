package kg.megacom.auction.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.auction.models.dto.BidDto;
import kg.megacom.auction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Bid Management",description = "Методы для управления ставками")
@RequestMapping(value = "/bid")

public class BidController {
    @Autowired
    private BidService service;
    @ApiOperation(value = "Создание или редактирование ставки")
    @PostMapping(value = "/save")
    public BidDto save(@RequestBody BidDto bidDto){
        return service.save(bidDto);
    }
}
