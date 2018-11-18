import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
import Models.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {
    BikeRentalSystem br;

    @BeforeAll
    public static void initAll() {
        System.out.println("Unit Tests: ");
    }
    @Test
    public void testeTeste(){
        assertEquals(2,1+1);
        System.out.println("funciona");
    }



}



