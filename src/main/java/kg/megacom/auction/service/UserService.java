package kg.megacom.auction.service;

import kg.megacom.auction.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    UserDto save( UserDto userDto);
}
