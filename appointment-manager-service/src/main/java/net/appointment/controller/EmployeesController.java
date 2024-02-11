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
    public ResponseEntity<ScheduleException> createEmployeeScheduleException(Integer employeeId, ScheduleException scheduleException) {
        return EmployeesApi.super.createEmployeeScheduleException(employeeId, scheduleException);
    }

    @Override
    public ResponseEntity<List<EmployeeWorkSchedule>> createEmployeeWorkSchedule(Integer employeeId, CreateEmployeeWorkScheduleRequest createEmployeeWorkScheduleRequest) {
        return EmployeesApi.super.createEmployeeWorkSchedule(employeeId, createEmployeeWorkScheduleRequest);
    }

    @Override
    public ResponseEntity<Review> createReviewForEmployee(Integer employeeId, ReviewInput reviewInput) {
        return EmployeesApi.super.createReviewForEmployee(employeeId, reviewInput);
    }

    @Override
    public ResponseEntity<Void> deleteEmployeeById(Integer employeeId) {
        return EmployeesApi.super.deleteEmployeeById(employeeId);
    }

    @Override
    public ResponseEntity<Void> deleteEmployeeScheduleException(Integer employeeId, Integer exceptionId) {
        return EmployeesApi.super.deleteEmployeeScheduleException(employeeId, exceptionId);
    }

    @Override
    public ResponseEntity<List<Appointment>> getAppointmentsByEmployee(Integer employeeId) {
        return EmployeesApi.super.getAppointmentsByEmployee(employeeId);
    }

    @Override
    public ResponseEntity<Resource> getEmployeeAvatar(Integer employeeId) {
        return EmployeesApi.super.getEmployeeAvatar(employeeId);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(Integer employeeId) {
        return EmployeesApi.super.getEmployeeById(employeeId);
    }

    @Override
    public ResponseEntity<List<ScheduleException>> getEmployeeScheduleExceptions(Integer employeeId) {
        return EmployeesApi.super.getEmployeeScheduleExceptions(employeeId);
    }

    @Override
    public ResponseEntity<EmployeeWorkSchedule> getEmployeeWorkSchedule(Integer employeeId) {
        return EmployeesApi.super.getEmployeeWorkSchedule(employeeId);
    }

    @Override
    public ResponseEntity<List<Review>> getReviewsByEmployee(Integer employeeId) {
        return EmployeesApi.super.getReviewsByEmployee(employeeId);
    }

    @Override
    public ResponseEntity<Employee> updateEmployeeById(Integer employeeId, Employee employee) {
        return EmployeesApi.super.updateEmployeeById(employeeId, employee);
    }

    @Override
    public ResponseEntity<ScheduleException> updateEmployeeScheduleException(Integer employeeId, Integer exceptionId, ScheduleException scheduleException) {
        return EmployeesApi.super.updateEmployeeScheduleException(employeeId, exceptionId, scheduleException);
    }

    @Override
    public ResponseEntity<List<EmployeeWorkSchedule>> updateEmployeeWorkSchedule(Integer employeeId, List<@Valid EmployeeWorkSchedule> employeeWorkSchedule) {
        return EmployeesApi.super.updateEmployeeWorkSchedule(employeeId, employeeWorkSchedule);
    }

    @Override
    public ResponseEntity<Void> uploadEmployeeAvatar(Integer employeeId, MultipartFile file) {
        return EmployeesApi.super.uploadEmployeeAvatar(employeeId, file);
    }
}
