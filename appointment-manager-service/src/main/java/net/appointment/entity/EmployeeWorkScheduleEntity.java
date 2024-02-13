package net.appointment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE_WORK_SCHEDULE")
@Data
public class EmployeeWorkScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private EmployeeEntity employee;

    @Column(name = "DAY_OF_WEEK")
    @Enumerated(value = EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @Column(name = "START_TIME")
    private LocalTime startTime;

    @Column(name = "END_TIME")
    private LocalTime endTime;

    @Column(name = "LUNCH_START_TIME")
    private LocalTime lunchStartTime;

    @Column(name = "LUNCH_END_TIME")
    private LocalTime lunchEndTime;
}
