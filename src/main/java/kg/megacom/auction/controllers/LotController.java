package kg.megacom.auction.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.auction.models.dto.LotDto;
import kg.megacom.auction.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Lot Management",description = "Методы для управления лотом")
@RequestMapping(value = "/lot")
public class LotController {
    @Autowired
    private LotService service;
    @PostMapping(value = "/save")
    @ApiOperation(value = "Создание или редактирование лота")
    public LotDto save(@RequestBody LotDto lotDto){
        return service.save(lotDto);
    }
}
