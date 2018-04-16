package com.recruitmentprj.entities;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable //imi ia toate campurile si le baga in tabela cared refera clasa asta
@Data
public class Contact {
    private String phone;
    private String email;
    private String address;
    private String city;
    private String country;
}
