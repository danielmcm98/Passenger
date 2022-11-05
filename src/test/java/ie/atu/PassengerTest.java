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
        myPassenger = new Passenger(null, null, null, null, 0);
    }

    void passengerSuccess(){
        myPassenger.mainPassenger("Mr","Daniel","1234567890","1234567",24);
        myPassenger.mainPassenger("Mrs","Daniel","1234567890","1234567",24);
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);

    }

    @Test
    void testTitlePassMr(){
        myPassenger.mainPassenger("Mr","Daniel","1234567890","1234567",24);
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testTitlePassMrs(){
        myPassenger.mainPassenger("Mrs","Daniel","1234567890","1234567",24);
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitlePassMs(){
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testNamePass(){
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);
        assertEquals("Daniel", myPassenger.getName());
    }

    @Test
    void testIdPass(){
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);
        assertEquals("1234567890", myPassenger.getId());
    }

    @Test
    void testPhonePass(){
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);
        assertEquals("1234567", myPassenger.getPhone());
    }

    @Test
    void testAgePass(){
        myPassenger.mainPassenger("Ms","Daniel","1234567890","1234567",24);
        assertEquals(24,myPassenger.getAge());
    }



    @Test
    void testTitleFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Msr","Daniel","1234567890","1234567",24);
        });
        assertEquals(test.getMessage(),"Wrong title");
    }

    @Test
    void testNameFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Da","1234567890","1234567",24);
        });
        assertEquals(test.getMessage(),"Name too short");
    }

    @Test
    void testIdFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","123456789","1234567",24);
        });
        assertEquals(test.getMessage(),"Id less than 10 characters");
    }

    @Test
    void testPhoneFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","1234567890","123456",24);
        });
        assertEquals(test.getMessage(),"Phone to short");
    }

    @Test
    void testAgeFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","1234567890","12345678",15);
        });
        assertEquals(test.getMessage(),"Age less than 16");
    }

    @AfterEach
    void tearDown() {

    }


}
