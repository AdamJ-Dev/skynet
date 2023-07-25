package org.skynet.backend.services;

import com.amadeus.resources.FlightDate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.skynet.backend.rest.dtos.FlightDTO;
import org.springframework.stereotype.Service;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.Destination;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private static String key = "BeHFw1dD9sSXycPHOAYMnuiVHHblGthN";

    private static String secret = "rM7AYrCBENROJtl2";
    static Amadeus amadeus = Amadeus

            .builder(key,secret)

            .build();

    static ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode;


    public static FlightDTO getFlightDTO(String originLocationCode, String destinationLocationCode, String departureDate, String returnDate)
            throws JsonProcessingException, ResponseException {
        FlightOfferSearch[] flightOffersSearches = amadeus.shopping.flightOffersSearch.get(
                Params.with("originLocationCode", originLocationCode)
                        .and("destinationLocationCode", destinationLocationCode)
                        .and("departureDate", departureDate)
                        .and("returnDate", returnDate)
                        .and("adults", 1));

        if (flightOffersSearches[0].getResponse().getStatusCode() != 200) {

            System.out.println("Wrong status code: " + flightOffersSearches[0].getResponse().getStatusCode());

            System.exit(-1);
        }

        String result = flightOffersSearches[0].getResponse().getBody();
        FlightDTO flightDTO = null;
        JsonNode resultJson = objectMapper.readTree(result);
        JsonNode journey1 = resultJson.get("data").get(0);
        JsonNode outboundJourney = journey1.get("itineraries").get(0);
        JsonNode inboundJourney = journey1.get("itineraries").get(1);
        
        String dtoPrice = journey1.get("price").get("total").asText();
        String dtoOutboundDuration = outboundJourney.get("duration").asText();
        String dtoInboundDuration = inboundJourney.get("duration").asText();

        // only outbound journey leg, still need inbound
        List<FlightDTO.Leg> dtoOutboundJourney = new ArrayList<>();
        for (int i = 0; i < outboundJourney.get("segments").size(); i++) {
            String departureTime = outboundJourney.get("segments").get(i).get("departure").get("at").asText();
            String arrivalTime = outboundJourney.get("segments").get(i).get("arrival").get("at").asText();
            String departureAirport = outboundJourney.get("segments").get(i).get("departure").get("iataCode").asText();
            String arrivalAirport = outboundJourney.get("segments").get(i).get("arrival").get("iataCode").asText();
            String duration = outboundJourney.get("segments").get(i).get("duration").asText();
            
            FlightDTO.Leg outboundLeg = new FlightDTO.Leg(departureTime, arrivalTime, departureAirport, arrivalAirport, duration);
            dtoOutboundJourney.add(outboundLeg);
        }

        System.out.println(dtoOutboundJourney.get(0).getDepartureTime() + dtoOutboundJourney.get(0).getArrivalTime());
        System.out.println(dtoOutboundJourney.get(1).getDepartureTime() + dtoOutboundJourney.get(1).getArrivalTime());
        return flightDTO;

    }

}
