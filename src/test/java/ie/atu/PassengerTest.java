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
        //creating new object of passsenger class
    }


    @Test
    void testTitlePassMr(){
        myPassenger.mainPassenger("Mr","Daniel","1234567890","1234567",24);
        assertEquals("Mr", myPassenger.getTitle());
        //testing output from Passeneger file against expected
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
            //creating exception called test and creating fail object to test
            myPassenger.mainPassenger("Msr","Daniel","1234567890","1234567",24);
        });
        assertEquals("Wrong title", test.getMessage());
        //testing that the error is the same sane as expected from test
    }

    @Test
    void testNameFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Da","1234567890","1234567",24);
        });
        assertEquals("Name too short",test.getMessage());
    }

    @Test
    void testIdFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","123456789","1234567",24);
        });
        assertEquals("Id less than 10 characters",test.getMessage());
    }

    @Test
    void testPhoneFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","1234567890","123456",24);
        });
        assertEquals("Phone to short",test.getMessage());
    }

    @Test
    void testAgeFail(){
        IllegalArgumentException test = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.mainPassenger("Mr","Daniel","1234567890","12345678",15);
        });
        assertEquals("Age less than 16",test.getMessage());
    }

    @AfterEach
    void tearDown() {

    }


}
