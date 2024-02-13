package net.appointment.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "SERVICES")
@Data
@EqualsAndHashCode(exclude = "image")
@ToString(exclude = "image")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private CompanyEntity company;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "DURATION")
    private Integer duration;

    @Lob
    @Column(name = "IMAGE")
    @Basic(fetch = FetchType.LAZY, optional = false)
    private byte[] image;

    @OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
    public List<AppointmentEntity> appointments;
}