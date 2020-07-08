
public class FlightsTester
{
    public static void main (String[]args)
    {
        Date d1=new Date(1,2,2000);
        Flight f1=new Flight(200,d1,"New York","London");
        Date d2=new Date(11,12,2000);

        Flight f2=new Flight(300,d2,"New York","London");
        f1.book(30);
        f2.book(2);
        Date d3=new Date(1,2,2000);
        Flight f3=new Flight(300,d3,"Paris","London");
        f3.book(20);
        Date d4=new Date(11,5,2005);
        Flight f4=new Flight(300,d4,"Paris","London");
        f4.book(20);
        Flights flights =new Flights();
        flights.addFlight(f1);
        flights.addFlight(f2);
        flights.addFlight(f3);
        flights.addFlight(f4);
        System.out.println("Num of flights "+flights.getNoOfFlights());
        System.out.println("Num of passengers "+flights.howManyPassengers());
        System.out.println("Earliest flight "+flights.earliestFlight());
        System.out.println("Amount of flights departing on "+d1+" "+flights.howManyFlightsDeparture(d1));
        System.out.println("\n"+flights.toString());
    }

        
}
