package net.appointment.service;

import lombok.RequiredArgsConstructor;
import net.appointment.entity.UserEntity;
import net.appointment.mapper.AppointmentMapper;
import net.appointment.mapper.UserMapper;
import net.appointment.model.Appointment;
import net.appointment.model.User;
import net.appointment.repo.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final AppointmentMapper appointmentMapper;

    public User createUser(User user) {
        UserEntity entity = userMapper.userToEntity(user);
        UserEntity savedEntity = userRepository.save(entity);
        return userMapper.entityToUser(savedEntity);
    }

    public void deleteUserById(UUID userId) {
        userRepository.deleteById(userId);
    }

    public List<Appointment> getAppointmentsByUser(UUID userId) {
        UserEntity entity = userRepository.findById(userId).orElseThrow();
        return appointmentMapper.entityToAppointment(entity.getAppointments());
    }

    public User getUserById(UUID userId) {
        UserEntity entity = userRepository.findById(userId).orElseThrow();
        return userMapper.entityToUser(entity);
    }

    public Resource getUserAvatar(UUID userId) {
        UserEntity entity = userRepository.findById(userId).orElseThrow();
        byte[] avatar = entity.getAvatar();
        if (avatar == null || avatar.length == 0) {
            throw new RuntimeException();
        }
        return new ByteArrayResource(avatar);
    }

    public User updateUserById(UUID userId, User user) {
        UserEntity entity = userRepository.findById(userId).orElseThrow();

        if (StringUtils.isNotBlank(user.getName())) {
            entity.setName(user.getName());
        }
        if (StringUtils.isNotBlank(user.getEmail())) {
            entity.setEmail(user.getEmail());
        }
        if (StringUtils.isNotBlank(user.getPhoneNumber()) && !entity.getPhoneNumber().equals(user.getPhoneNumber())) {
            entity.setPhoneNumber(user.getPhoneNumber());
            entity.setPhoneNumberConfirmed(false);
        }

        UserEntity savedEntity = userRepository.save(entity);
        return userMapper.entityToUser(savedEntity);
    }
}