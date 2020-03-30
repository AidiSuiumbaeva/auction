package kg.megacom.auction.service.impl;

import kg.megacom.auction.mappers.ClassMappers;
import kg.megacom.auction.models.dto.UserDto;
import kg.megacom.auction.models.entity.User;
import kg.megacom.auction.repositories.UserRep;
import kg.megacom.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRep userRep;
    @Override
    public UserDto save(UserDto userDto) {
        User user= ClassMappers.INSTANCE.userDtoToUser(userDto);
        userRep.save(user);
        userDto=ClassMappers.INSTANCE.userToUserDto(user);
        return userDto;
    }


}
