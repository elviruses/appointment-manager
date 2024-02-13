package net.appointment.mapper;

import net.appointment.entity.AppointmentEntity;
import net.appointment.model.Appointment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {

    AppointmentEntity appointmentToEntity(Appointment appointment);

    Appointment entityToAppointment(AppointmentEntity entity);

    List<AppointmentEntity> appointmentToEntity(List<Appointment> appointment);

    List<Appointment> entityToAppointment(List<AppointmentEntity> entity);
}
