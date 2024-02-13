package net.appointment.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEES")
@Data
@EqualsAndHashCode(exclude = "avatar")
@ToString(exclude = "avatar")
public class EmployeeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COMPANY_ID")
  private CompanyEntity company;

  @Column(name = "NAME")
  private String name;

  @Column(name = "PHONE_NUMBER")
  private String phoneNumber;

  @Column(name = "ADDRESS")
  private String address;

  @Lob
  @Column(name = "AVATAR")
  @Basic(fetch = FetchType.LAZY, optional = false)
  private byte[] avatar;

  @Column(name = "HAS_AVATAR")
  private Boolean hasAvatar;

  @Column(name = "CREATED_AT")
  private LocalDateTime createdAt;

  @Column(name = "IS_ACTIVE")
  private Boolean isActive;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
          name = "EMPLOYEE_SPECIALIZATIONS",
          joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
          inverseJoinColumns = @JoinColumn(name = "SPECIALIZATION_ID")
  )
  private List<SpecializationEntity> specializations;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
          name = "EMPLOYEE_SERVICES",
          joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
          inverseJoinColumns = @JoinColumn(name = "SERVICE_ID")
  )
  private List<ServiceEntity> services;

  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  public List<ReviewEntity> reviews;

  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  public List<EmployeeWorkScheduleEntity> workSchedules;

  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  public List<EmployeeWorkScheduleExceptionEntity> workScheduleExceptions;

  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  public List<AppointmentEntity> appointments;
}