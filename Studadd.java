package com.javaeplanet.project.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter

public class Studadd{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "student_table", referencedColumnName = "stu_sno")
    private Student student;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "add_table", referencedColumnName = "add_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_tid", referencedColumnName = "teacher_tid")
    private Teacher teacher;

}
