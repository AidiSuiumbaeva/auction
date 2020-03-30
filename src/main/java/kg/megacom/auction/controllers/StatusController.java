package kg.megacom.auction.controllers;

import kg.megacom.auction.models.dto.StatusDto;
import kg.megacom.auction.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/status")
public class StatusController {

    @Autowired
    private StatusService statusService;
    @PostMapping(value = "/save")
    public StatusDto save(@RequestBody StatusDto statusDto){
        return statusService.save(statusDto);
    }
}
