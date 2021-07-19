package com.paypal.bfs.test.employeeserv.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Table(appliesTo = "employee")
@Setter
@Getter
@ToString
public class Employee {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}