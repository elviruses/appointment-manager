package net.appointment.controller;

import net.appointment.api.EmployeesApi;
import net.appointment.model.*;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeesController implements EmployeesApi {

    @Override
    public ResponseEntity<ScheduleException> createEmployeeScheduleException(String employeeId, ScheduleException scheduleException) {
        return EmployeesApi.super.createEmployeeScheduleException(employeeId, scheduleException);
    }

    @Override
    public ResponseEntity<List<EmployeeWorkSchedule>> createEmployeeWorkSchedule(String employeeId, CreateEmployeeWorkScheduleRequest createEmployeeWorkScheduleRequest) {
        return EmployeesApi.super.createEmployeeWorkSchedule(employeeId, createEmployeeWorkScheduleRequest);
    }

    @Override
    public ResponseEntity<Review> createReviewForEmployee(String employeeId, ReviewInput reviewInput) {
        return EmployeesApi.super.createReviewForEmployee(employeeId, reviewInput);
    }

    @Override
    public ResponseEntity<Void> deleteEmployeeById(String employeeId) {
        return EmployeesApi.super.deleteEmployeeById(employeeId);
    }

    @Override
    public ResponseEntity<Void> deleteEmployeeScheduleException(String employeeId, String exceptionId) {
        return EmployeesApi.super.deleteEmployeeScheduleException(employeeId, exceptionId);
    }

    @Override
    public ResponseEntity<List<Appointment>> getAppointmentsByEmployee(String employeeId) {
        return EmployeesApi.super.getAppointmentsByEmployee(employeeId);
    }

    @Override
    public ResponseEntity<Resource> getEmployeeAvatar(String employeeId) {
        return EmployeesApi.super.getEmployeeAvatar(employeeId);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(String employeeId) {
        return EmployeesApi.super.getEmployeeById(employeeId);
    }

    @Override
    public ResponseEntity<List<ScheduleException>> getEmployeeScheduleExceptions(String employeeId) {
        return EmployeesApi.super.getEmployeeScheduleExceptions(employeeId);
    }

    @Override
    public ResponseEntity<EmployeeWorkSchedule> getEmployeeWorkSchedule(String employeeId) {
        return EmployeesApi.super.getEmployeeWorkSchedule(employeeId);
    }

    @Override
    public ResponseEntity<List<Review>> getReviewsByEmployee(String employeeId) {
        return EmployeesApi.super.getReviewsByEmployee(employeeId);
    }

    @Override
    public ResponseEntity<Employee> updateEmployeeById(String employeeId, Employee employee) {
        return EmployeesApi.super.updateEmployeeById(employeeId, employee);
    }

    @Override
    public ResponseEntity<ScheduleException> updateEmployeeScheduleException(String employeeId, String exceptionId, ScheduleException scheduleException) {
        return EmployeesApi.super.updateEmployeeScheduleException(employeeId, exceptionId, scheduleException);
    }

    @Override
    public ResponseEntity<List<EmployeeWorkSchedule>> updateEmployeeWorkSchedule(String employeeId, List<@Valid EmployeeWorkSchedule> employeeWorkSchedule) {
        return EmployeesApi.super.updateEmployeeWorkSchedule(employeeId, employeeWorkSchedule);
    }

    @Override
    public ResponseEntity<Void> uploadEmployeeAvatar(String employeeId, MultipartFile file) {
        return EmployeesApi.super.uploadEmployeeAvatar(employeeId, file);
    }
}
