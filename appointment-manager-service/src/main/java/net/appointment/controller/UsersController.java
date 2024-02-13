package net.appointment.controller;

import lombok.RequiredArgsConstructor;
import net.appointment.api.UsersApi;
import net.appointment.model.Appointment;
import net.appointment.model.User;
import net.appointment.service.UserService;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UsersController implements UsersApi {

    private final UserService service;

    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @Override
    public ResponseEntity<Void> deleteUserById(String userId) {
        service.deleteUserById(UUID.fromString(userId));
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<Appointment>> getAppointmentsByUser(String userId) {
        return ResponseEntity.ok(service.getAppointmentsByUser(UUID.fromString(userId)));
    }

    @Override
    public ResponseEntity<Resource> getUserAvatar(String userId) {
        return ResponseEntity.ok(service.getUserAvatar(UUID.fromString(userId)));
    }

    @Override
    public ResponseEntity<User> getUserById(String userId) {
        return ResponseEntity.ok(service.getUserById(UUID.fromString(userId)));
    }

    @Override
    public ResponseEntity<User> updateUserById(String userId, User user) {
        return ResponseEntity.ok(service.updateUserById(UUID.fromString(userId), user));
    }

    @Override
    public ResponseEntity<Void> uploadUserAvatar(String userId, MultipartFile file) {
        return UsersApi.super.uploadUserAvatar(userId, file);
    }
}