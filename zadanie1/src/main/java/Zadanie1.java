import java.util.Objects;
import java.util.Scanner;

// Zadanie pierwsze z kursu java

public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println("Witaj świecie");
        Scanner scanInput = new Scanner(System.in);
nie
        do {

          System.out.print("Aby zamknąć aplikację, trzeba wpisać exit i nacisnąć klawisz enter:\n");
        } while (!Objects.equals(scanInput.nextLine(),"exit"));
    }
}

