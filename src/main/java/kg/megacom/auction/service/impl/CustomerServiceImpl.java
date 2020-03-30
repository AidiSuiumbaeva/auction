package kg.megacom.auction.service.impl;

import kg.megacom.auction.mappers.ClassMappers;
import kg.megacom.auction.models.dto.CustomerDto;
import kg.megacom.auction.models.entity.Customers;
import kg.megacom.auction.repositories.CustRep;
import kg.megacom.auction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustRep custRep;
    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customers customers= ClassMappers.INSTANCE.customerDtoToCutomer(customerDto);
        custRep.save(customers);
        customerDto=ClassMappers.INSTANCE.customersToCustomerDto(customers);
        return customerDto;
    }
}
