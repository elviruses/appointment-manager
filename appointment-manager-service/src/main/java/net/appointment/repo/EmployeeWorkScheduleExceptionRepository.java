package net.appointment.repo;

import net.appointment.entity.EmployeeWorkScheduleExceptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeWorkScheduleExceptionRepository extends JpaRepository<EmployeeWorkScheduleExceptionEntity, UUID> {}