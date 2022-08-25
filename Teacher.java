package com.javaeplanet.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import javax.persistence.*;

@Entity
@Getter
@Data
@Setter
@EnableAutoConfiguration
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;

    @Column(name = "teacher_tid")
    private String teacherTid;

}
