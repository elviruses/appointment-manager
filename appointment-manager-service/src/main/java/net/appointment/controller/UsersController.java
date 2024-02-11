package net.appointment.controller;

import net.appointment.api.UsersApi;
import net.appointment.model.Appointment;
import net.appointment.model.User;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class UsersController implements UsersApi {

    @Override
    public ResponseEntity<User> createUser(User user) {
        return UsersApi.super.createUser(user);
    }

    @Override
    public ResponseEntity<Void> deleteUserById(Integer userId) {
        return UsersApi.super.deleteUserById(userId);
    }

    @Override
    public ResponseEntity<List<Appointment>> getAppointmentsByUser(Integer userId) {
        return UsersApi.super.getAppointmentsByUser(userId);
    }

    @Override
    public ResponseEntity<Resource> getUserAvatar(Integer userId) {
        return UsersApi.super.getUserAvatar(userId);
    }

    @Override
    public ResponseEntity<User> getUserById(Integer userId) {
        return UsersApi.super.getUserById(userId);
    }

    @Override
    public ResponseEntity<User> updateUserById(Integer userId, User user) {
        return UsersApi.super.updateUserById(userId, user);
    }

    @Override
    public ResponseEntity<Void> uploadUserAvatar(Integer userId, MultipartFile file) {
        return UsersApi.super.uploadUserAvatar(userId, file);
    }
}