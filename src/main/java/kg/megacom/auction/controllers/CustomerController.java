package kg.megacom.auction.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.auction.models.dto.CustomerDto;
import kg.megacom.auction.models.entity.Customers;
import kg.megacom.auction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Customer Management",description = "Методы для управления клиентом")
@RequestMapping(value = "/customer")

public class CustomerController {
    @Autowired
   private CustomerService service;
@PostMapping(value = "/save")
@ApiOperation(value = "Создание или редактирование клиента")
    public CustomerDto save(@RequestBody CustomerDto customerDto){
        return service.save(customerDto);
    }
    
}
