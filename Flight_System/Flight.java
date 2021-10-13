package Flight_System;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    private Ticket ticket;
    private Passenger passenger;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    public String checkAvailability(){
        if(this.bookedSeats<capacity)
            return "available";
        else
            return "Not Available";
    }

    public void incrementBookingCounter(){      //Seat Booking Counter
        this.bookedSeats++;
    }

    public String getFlightNumber() { //Getter for flight number
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) { //Setter for Flight Number
        this.flightNumber = flightNumber;
    }

    public String getAirline() { //Getter
        return airline;
    }

    public void setAirline(String airline) { //Setter
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {       // Getter Method
        return passenger.getPassengerCount();
    }

    public void setBookedSeats(int bookedSeats) {       // setter Method
        this.bookedSeats = bookedSeats;
    }
}
