package com.javaeplanet.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;


@Data
@Entity
@Getter
@Setter
@Table(name = "student_table")
@EnableAutoConfiguration
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_sno")
    private Integer sno;
    private String stdName;
    private String stdClass;
    private String schoolName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_add_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_tid", referencedColumnName = "teacher_tid")
    private Teacher teacher;
}

