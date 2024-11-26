package MapInterface;

public class Flight_manifest {
   private String flightNo;
    private String airline;
    private int pax;

    public Flight_manifest(String flightNo, String airline, int pax) {
        this.flightNo = flightNo;
        this.airline = airline;
        this.pax = pax;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }
}
