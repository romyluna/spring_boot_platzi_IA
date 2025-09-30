package com.platzi.play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;


//todo lo que usemos con IA
@AiService
public interface PlatziPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestión de peliculas PlatziPlay
            usa menos de 120 caracteresy hazo con el estilo de platzi.
            """)
    String generateGreeting();

}
