package net.appointment.repo;

import net.appointment.entity.EmployeeWorkScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeWorkScheduleRepository extends JpaRepository<EmployeeWorkScheduleEntity, UUID> {}