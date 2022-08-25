package com.javaeplanet.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Data
@Entity
@Getter
@Setter
@Table(name = "add_table")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Integer aid;
    private String city;
    private Integer pin_code;

    @OneToOne(mappedBy = "address")
    private Student student_table;
}
