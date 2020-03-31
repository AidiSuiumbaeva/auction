package kg.megacom.auction.mappers;

import kg.megacom.auction.models.dto.*;
import kg.megacom.auction.models.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ClassMappers {
    ClassMappers INSTANCE= Mappers.getMapper(ClassMappers.class);

/*@Mapping(source = "phone", target="number")
    Student studentDtoToStudent(StudentDto studentDto);
    @Mapping(source = "number", target="phone")
    StudentDto studentToStudentDto(Student student);*/
@Mappings({
    @Mapping(source = "lotDto", target="lot"),
    @Mapping(source = "customerDto", target="customer")})
Bids bidDtoToBids(BidDto bidDto);
    @Mappings({
    @Mapping(source = "lot", target="lotDto"),
    @Mapping(source = "customer", target="customerDto")})
BidDto bidsToBidDto(Bids bids);

Customers customerDtoToCutomer(CustomerDto customerDto);
CustomerDto customersToCustomerDto(Customers customers);

    @Mapping(source = "statusIdDto", target="statusId")
Lot lotDtoToLot(LotDto lotDto);
    @Mapping(source = "statusId", target="statusIdDto")
LotDto lotToLotDto(Lot lot);

Statuses statusDtoToStatus(StatusDto statusDto);
StatusDto statusToStatuses(Statuses statuses);

User userDtoToUser(UserDto userDto);
UserDto userToUserDto(User user);

}
