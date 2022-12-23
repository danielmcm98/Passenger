package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
   Passenger myPassenger;
    @BeforeEach
    void setUP() {
        myPassenger = new Passenger("Mr", "Daniel", "1234567890", "1234567", 24);
    }
    @Test
    void testTitlePass(){
        assertEquals("Mr", myPassenger.getTitle());
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testNamePass(){
        assertEquals("Daniel", myPassenger.getName());
    }
    @Test
    void testIdPass(){
        assertEquals("1234567890", myPassenger.getId());
    }
    @Test
    void testPhonePass(){
        assertEquals("1234567", myPassenger.getPhone());
    }
    @Test
    void testAgePass(){
        assertEquals(24,myPassenger.getAge());
    }
   @Test
    void testTitleFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{myPassenger.setTitle("Mister");});
       assertEquals("Wrong title", test.getMessage());
    }
    @Test
    void testNameFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{myPassenger.setName("er");});
        assertEquals("Name too short", test.getMessage());
    }
    @Test
    void testIdFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{myPassenger.setId("2");});
        assertEquals("Id less than 10 characters", test.getMessage());
    }
    @Test
    void testPhoneFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{myPassenger.setPhone("8754");});
        assertEquals("Phone to short", test.getMessage());
    }
    @Test
    void testAgeFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{myPassenger.setAge(12);});
        assertEquals("Age less than 16", test.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}