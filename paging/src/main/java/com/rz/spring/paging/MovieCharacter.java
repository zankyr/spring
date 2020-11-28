package com.rz.spring.paging;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "character")
@Data
public class MovieCharacter {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String movie;
}
