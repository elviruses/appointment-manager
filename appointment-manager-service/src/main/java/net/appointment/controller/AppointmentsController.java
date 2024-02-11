package net.appointment.controller;

import net.appointment.api.AppointmentsApi;
import net.appointment.model.Appointment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentsController implements AppointmentsApi {

    @Override
    public ResponseEntity<Appointment> createAppointment(Appointment appointment) {
        return AppointmentsApi.super.createAppointment(appointment);
    }

    @Override
    public ResponseEntity<Void> deleteAppointmentById(Integer appointmentId) {
        return AppointmentsApi.super.deleteAppointmentById(appointmentId);
    }

    @Override
    public ResponseEntity<Appointment> getAppointmentById(Integer appointmentId) {
        return AppointmentsApi.super.getAppointmentById(appointmentId);
    }

    @Override
    public ResponseEntity<List<Appointment>> getAppointments() {
        return AppointmentsApi.super.getAppointments();
    }

    @Override
    public ResponseEntity<Appointment> updateAppointmentById(Integer appointmentId, Appointment appointment) {
        return AppointmentsApi.super.updateAppointmentById(appointmentId, appointment);
    }
}
