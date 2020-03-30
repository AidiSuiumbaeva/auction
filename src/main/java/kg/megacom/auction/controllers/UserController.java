package kg.megacom.auction.controllers;

import kg.megacom.auction.models.dto.UserDto;
import kg.megacom.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping(value = "/save")
    public UserDto save(@RequestBody UserDto userDto){
        return service.save(userDto);
    }
}
