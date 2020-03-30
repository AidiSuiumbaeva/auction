package kg.megacom.auction.mappers;

import kg.megacom.auction.models.dto.*;
import kg.megacom.auction.models.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ClassMappers {
    ClassMappers INSTANCE= Mappers.getMapper(ClassMappers.class);

/*@Mapping(source = "phone", target="number")
    Student studentDtoToStudent(StudentDto studentDto);
    @Mapping(source = "number", target="phone")
    StudentDto studentToStudentDto(Student student);*/

Bids bidDtoToBids(BidDto bidDto);
BidDto bidsToBidDto(Bids bids);

Customers customerDtoToCutomer(CustomerDto customerDto);
CustomerDto customersToCustomerDto(Customers customers);

Lot lotDtoToLot(LotDto lotDto);
LotDto lotToLotDto(Lot lot);

Statuses statusDtoToStatus(StatusDto statusDto);
StatusDto statusToStatuses(Statuses statuses);

User userDtoToUser(UserDto userDto);
UserDto userToUserDto(User user);

}
