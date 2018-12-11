package kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Kocurek")
class KalkultorAppTest {

    @Test
    public void addTwoPositiveIntegers() {
        // arrange
        KalkultorApp kalkultorApp = new KalkultorApp();
// act
        int suma = kalkultorApp.add(1, 13);

//assert
        Assertions.assertEquals(14, suma, "Sprawdź, że dodawanie liczb całkowitych dzialą");

    }

    @Test
    public void addTwoPositiveDouble() {
        // arrange
        KalkultorApp kalkultorApp = new KalkultorApp();
// act
        double suma = kalkultorApp.add(1.23, 3.0);

//assert
        Assertions.assertEquals(4.23, suma, "Sprawdź, że dodawanie liczb całkowitych dzialą");

        Assertions.assertEquals(4.23, suma, 0.0000001,  "Sprawdź, że dodawanie liczb całkowitych dzialą");
    }

}

