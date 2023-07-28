package org.skynet.backend.rest.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class FlightDTO {

    public static class Leg {
        private String departureTime;
        private String arrivalTime;
        private String departureAirport;
        private String arrivalAirport;
        private String duration;

        public Leg(String departureTime, String arrivalTime, String departureAirport, String arrivalAirport, String duration ) {
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.duration = duration;
        };

        public String getDepartureTime() {
            return departureTime;
        }

        public String getArrivalTime() {
            return arrivalTime;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        public String getDuration() {
            return duration;
        }
    }

    private Double price;
    private List<Leg> inboundLegs;
    private List<Leg> outboundLegs;
    private String inboundDuration;
    private String outboundDuration;


}