package com.komponente.reservation_service.model;

import javax.persistence.*;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(indexes = {@Index(columnList = "type", unique = true)})
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
}
