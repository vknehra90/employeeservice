package com.paypal.bfs.test.employeeserv.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Table(appliesTo = "address")
@Getter
@Setter
public class Address {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String addressId;

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private String zipCode;

   // @OneToOne(cascade = CascadeType.ALL)
   @OneToOne(cascade = {CascadeType.PERSIST,
           CascadeType.DETACH,
           CascadeType.REFRESH,
           CascadeType.REMOVE}
   )
    @JoinColumn(name = "address_id")
    private Employee employee;

}