package com.recruitmentprj.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "LANGUAGES")
public class Language {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

}
