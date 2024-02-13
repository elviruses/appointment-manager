package net.appointment.mapper;

import net.appointment.entity.UserEntity;
import net.appointment.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "avatar", ignore = true)
    @Mapping(target = "appointments", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "phoneNumberConfirmed", constant = "false")
    @Mapping(target = "hasAvatar", constant = "false")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "isActive", constant = "false")
    UserEntity userToEntity(User user);

    User entityToUser(UserEntity entity);
}
