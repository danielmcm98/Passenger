package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class ThePassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThePassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){

			PassengerService myService = new PassengerService();
			return myService.getPassengers();

	}
	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Daniel", "123", "619L", 24);
		return myPassenger;

	}


}
