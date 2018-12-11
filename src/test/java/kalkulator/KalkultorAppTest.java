package kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkultorAppTest {

    @Test
    public void addTestInt() {
        // arrange
        KalkultorApp kalkultorApp = new KalkultorApp();
// act
        int suma = kalkultorApp.add(1, 13);

//assert
        Assertions.assertEquals(14, suma, "Sprawdź, że dodawanie liczb całkowitych dzialą");


    }

    @Test
    public void addTestDouble() {
        // arrange
        KalkultorApp kalkultorApp = new KalkultorApp();
// act
        double suma = kalkultorApp.add(1.23, 3.0);

//assert
        Assertions.assertEquals(4.23, suma, "Sprawdź, że dodawanie liczb całkowitych dzialą");


    }

}

