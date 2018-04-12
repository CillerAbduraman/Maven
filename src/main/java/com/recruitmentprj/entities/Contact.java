package com.recruitmentprj.entities;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Contact {
    private String phone;
    private String email;
    private String address;
    private String city;
    private String country;
}
