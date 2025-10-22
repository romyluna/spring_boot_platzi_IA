package com.platzi.play.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "platzi_play_peliculas")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @Column(nullable = false, length = 150, unique = true ) /*el titulo debe ser unico*/
    private String titulo;

    @Column(nullable = false, precision = 3) /*hasta 3 caracteres*/
    private Integer duracion;

    @Column(nullable = false, length = 40)
    private String genero;

    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;

    @Column(precision = 3, scale = 2) /*hasta 3 caracteres con 2 decimales*/
    private BigDecimal clasificacion;

    @Column(nullable = false, length = 1)
    private String estado;

}
