package ie.atu.Passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers(){

        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Daniel", "123", "619L", 24),
                new Passenger("Mr", "Daniel2", "153", "619F", 21),
                new Passenger("Mr", "Daniel3", "163", "619D", 22));
        return myPassengers;

    }


    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Daniel", "123", "619L", 24);
        return myPassenger;

    }


}
