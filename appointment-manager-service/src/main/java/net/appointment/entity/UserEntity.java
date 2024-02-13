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
@Table(name = "USERS")
@Data
@EqualsAndHashCode(exclude = "avatar")
@ToString(exclude = "avatar")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PHONE_NUMBER_CONFIRMED")
    private Boolean phoneNumberConfirmed;

    @Lob
    @Column(name = "AVATAR")
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Transient
    private byte[] avatar;

    @Column(name = "HAS_AVATAR")
    private Boolean hasAvatar;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<AppointmentEntity> appointments;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<ReviewEntity> reviews;
}