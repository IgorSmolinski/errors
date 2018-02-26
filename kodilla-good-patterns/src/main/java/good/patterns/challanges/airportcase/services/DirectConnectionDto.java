package good.patterns.challanges.airportcase.services;

public class DirectConnectionDto {

    String arrivalAirport;
    String departureAirport;
    boolean directPossiblity;

    public DirectConnectionDto(String arrivalAirport, String departureAirport, boolean directPossiblity) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.directPossiblity = directPossiblity;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public boolean isDirectPossiblity() {
        return directPossiblity;
    }
}
