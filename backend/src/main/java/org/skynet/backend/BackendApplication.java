package org.skynet.backend;


import com.amadeus.exceptions.ResponseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) throws ResponseException, JsonProcessingException {

        SpringApplication.run(BackendApplication.class, args);

    }
}