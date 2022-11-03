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
        assertEquals("1234567890", myPassenger.getId());
    }

    @Test
    void testPhonePass(){
        myPassenger.setPhone(0851234567);
        assertEquals(0851234567, myPassenger.getPhone());
    }

    @Test
    void testAgePass(){
        myPassenger.setAge(17);
        assertEquals(17,myPassenger.getAge());
    }

    @Test
    void testNameFail(String Name){

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
