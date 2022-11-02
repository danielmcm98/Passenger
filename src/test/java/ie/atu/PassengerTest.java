package ie.atu;

import ie.atu.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUP() {
        myPassenger = new Passenger(null, null, null, 0, 0);
    }

    @Test
    void testTitlePassMr(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testTitlePassMrs(String Title){
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitlePassMs(String Title){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testNamePass(String Name){
        myPassenger.setName("Daniel");
        assertEquals("Daniel", myPassenger.getName());
    }

    @Test
    void testIdPass(String Id){
        myPassenger.setId("12345678910");

    }

    @Test
    void testPhonePass(){

    }

    @Test
    void testAgePass(){
       // assertGreaterThan(17, Passenger.Age);
    }

    @Test
    void testNameFail(String Name){
        myPassenger.setName("Da");

    }

    @Test
    void testTitleFail(){

    }

    @Test
    void testIdFail(){

    }

    @Test
    void testPhoneFail(){

    }

    @Test
    void testAgeFail(){
        // assertGreaterThan(17, Passenger.Age);
    }

    @AfterEach
    void tearDown() {

    }


}
