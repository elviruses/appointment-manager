package net.appointment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE_WORK_SCHEDULE_EXCEPTIONS")
@Data
public class EmployeeWorkScheduleExceptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private EmployeeEntity employee;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "START_TIME")
    private LocalDateTime startTime;

    @Column(name = "END_TIME")
    private LocalDateTime endTime;

    @Column(name = "REASON")
    private String reason;
}