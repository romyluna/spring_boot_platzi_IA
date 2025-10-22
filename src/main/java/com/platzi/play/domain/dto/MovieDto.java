package com.platzi.play.domain.dto;

import java.time.LocalDate;

/*clase record permite definir clases inmutables - java se encarga de generar constructor y metodos de acceso*/

public record MovieDto(
        String title,
        Integer duration,
        String genre,
        LocalDate releaseData,
        Double rating

) {
}
