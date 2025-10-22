package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;


//todo lo que usemos con IA
@AiService
public interface PlatziPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestión de peliculas {{plataform}}
            usa menos de 120 caracteresy hazo con el estilo de platzi.
            """)
    String generateGreeting(@V("plataform") String plataform);

}
