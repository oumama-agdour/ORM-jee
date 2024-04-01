package com.example.ormjee.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.util.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor  @AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id  ;
    private String nom;
    private String dateN;
    private boolean malade;
    private int score;


}
