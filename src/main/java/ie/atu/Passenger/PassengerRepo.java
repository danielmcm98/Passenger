package ie.atu.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    public Passenger findPassengerByName(String name);

    @Query(value = "SELECT p FROM Passenger p WHERE p.Age > ?1 and p.Age < ?2", nativeQuery = true)
    public List<Passenger> findPassengerByAge(int age, int age2);
}