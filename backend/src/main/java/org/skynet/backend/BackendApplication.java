package org.skynet.backend;


import com.amadeus.exceptions.ResponseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.skynet.backend.services.FlightService;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) throws ResponseException, JsonProcessingException {

        FlightService.getFlightDTO("SYD", "BKK", "2023-12-01", "2023-12-08");

    }
}