package atm;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @Test
    void processAmount() {
        ATM atm = new ATM();
        System.setOut(new PrintStream(byteArrayOutputStream));
        atm.processAmount(125);
        assertEquals(byteArrayOutputStream.toString().trim(), "20 bills : 6\n10 bills : 0\n5 bills : 1");
        System.setOut(System.out);
    }

    @Test
    void processIncorrectAmount() {
        ATM atm = new ATM();
        assertThrows(IllegalArgumentException.class , () -> {atm.processAmount(126);});
    }

}