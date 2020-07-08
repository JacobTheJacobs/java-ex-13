

public class Flights
{
    private Flight [] _data;
    private int _noOfFlights;
    private final int MAX_FLIGHTS = 100;

    /**
     * default constructor
     */
    public Flights() {
        _data = new Flight[MAX_FLIGHTS];
        _noOfFlights = 0;
    }

    /**
     * Get the number of flights that are actually in the  list
     * @return the number of Flights that are actually in the  list
     */
    public int getNoOfFlights() {
        return _noOfFlights;
    }
    
    /**
     * Add a new flight to the flights list.
     * If the list is full, the flight will be not added.
     * @param flight the new flight to add
     * @return true if able to add the new flight, false otherwise
     */
    public boolean addFlight(Flight flight) {
        if (_noOfFlights == _data.length) {
            return false;//no room in array
        }
        _data [_noOfFlights] = new Flight (flight);//avoid aliasing
        _noOfFlights++;
        return true;
    }

    

    /**
	 * Count how many passengers are travelling on all the flights
	 * @return number of passengers booked on all the flights	 
	 */
	public int howManyPassengers() {
		int noPassengers = 0;
		for (int i = 0; i < _noOfFlights; i++) 
			noPassengers += _data[i].getBooked();
				
		return noPassengers;
	}

    /**
     * Count how many flights leave on a certain date
     * @param date departure date
     * @return number of flights that leave on a certain date
     */
    public int howManyFlightsDeparture(Date date) {
        int numFlights = 0;
        for (int i = 0; i < _noOfFlights; i++) {
            if(_data[i].getFlightDate().equals(date)) {
                numFlights++;
            }
        }
        return numFlights;
    }

    

    
    /**
     * Search the rides list for the earliest flight and return its departure date.
     * @return the  earliest flight. If there are no flights return null.
     */
    public Flight earliestFlight() {
        if (_noOfFlights == 0)
            return null;
        Flight earliestFlight = _data[0];
       
        for (int i = 1; i < _noOfFlights; i++) {
            if( _data[i].getFlightDate().before(earliestFlight.getFlightDate())) {
                earliestFlight = _data[i];
            }
        }
        return new Flight(earliestFlight);
    }
    /**
     * Return a string of all the flights
     * @return a string of all the flights
     */
    public String toString(){
        String s="The flights  are:\n";
        for (int i = 0; i < _noOfFlights; i++) {
            s+=_data[i].toString()+"\n";
        }
        return s;
    }

}
