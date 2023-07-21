package org.skynet.backend;



import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.Destination;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendApplication {

    private static String key;

    private static String secret;

    public static void main(String[] args) throws ResponseException {

        findFlights();

    }



    public static void findFlights() throws ResponseException {

        Amadeus amadeus = Amadeus

                .builder(key,secret)

                .build();



        FlightOfferSearch[] flightOffersSearches = amadeus.shopping.flightOffersSearch.get(

                Params.with("originLocationCode", "SYD")

                        .and("destinationLocationCode", "BKK")

                        .and("departureDate", "2023-12-01")

                        .and("returnDate", "2023-12-08")

                        .and("adults", 1)

                        .and("max", 3));



        if (flightOffersSearches[0].getResponse().getStatusCode() != 200) {

            System.out.println("Wrong status code: " + flightOffersSearches[0].getResponse().getStatusCode());

            System.exit(-1);

        }



        System.out.println(flightOffersSearches[0].getResponse().getBody());

        System.out.println(flightOffersSearches[1]);

        System.out.println(flightOffersSearches[2]);

    }

    public static void findIncomingFlightSourceLocations() throws ResponseException {

        Amadeus amadeus = Amadeus

                .builder(key, secret)

                .build();



        Destination[] directDestinations = amadeus.airport.directDestinations.get(

                Params.with("departureAirportCode", "MAD"));



        if (directDestinations[0].getResponse().getStatusCode() != 200) {

            System.out.println("Wrong status code: " + directDestinations[0].getResponse().getStatusCode());

            System.exit(-1);

        }



        System.out.println(directDestinations[0]);

    }

    public static void getNearestAirport() throws ResponseException {

        Amadeus amadeus = Amadeus

                .builder(key, secret)

                .build();



// Airport Nearest Relevant (for London)

        Location[] locations = amadeus.referenceData.locations.airports.get(Params

                .with("latitude", 45.343934)

                .and("longitude", -8.006220));



        if(locations[0].getResponse().getStatusCode() != 200) {

            System.out.println("Wrong status code: " + locations[0].getResponse().getStatusCode());

            System.exit(-1);

        }

        System.out.println(locations[0]);

    }



    public static void getLocations() throws ResponseException {

        Amadeus amadeus = Amadeus

                .builder(key, secret)

                .build();



        Location[] locations = amadeus.referenceData.locations.get(Params

                .with("keyword", "LON")

                .and("subType", Locations.ANY));



        System.out.println(locations[0]);

    }

}