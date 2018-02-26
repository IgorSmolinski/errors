package good.patterns.challanges.airportcase.services;

import java.util.Objects;

public class DirectConnectionDto {

    String arrivalAirport;
    String departureAirport;
    boolean directPossiblity;

    public DirectConnectionDto(String arrivalAirport, String departureAirport, boolean directPossiblity) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.directPossiblity = directPossiblity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DirectConnectionDto)) return false;
        DirectConnectionDto that = (DirectConnectionDto) o;
        return directPossiblity == that.directPossiblity &&
                Objects.equals(arrivalAirport, that.arrivalAirport) &&
                Objects.equals(departureAirport, that.departureAirport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalAirport, departureAirport, directPossiblity);
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
