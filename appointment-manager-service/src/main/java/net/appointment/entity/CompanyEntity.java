package net.appointment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "COMPANIES")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Lob
    @Column(name = "LOGO")
    @Basic(fetch = FetchType.LAZY, optional = false)
    private byte[] logo;

    @Column(name = "HAS_LOGO")
    private Boolean hasLogo;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    public List<ReviewEntity> reviews;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    public List<ServiceEntity> services;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    public List<EmployeeEntity> employees;
}