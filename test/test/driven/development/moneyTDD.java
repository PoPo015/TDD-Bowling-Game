package test.driven.development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class moneyTDD {


    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.time(2));
        assertEquals(new Dollar(15), five.time(3));
    }

    @Test
    @DisplayName("3장 동일성(equals) 체크")
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

    }

    @Test
    @DisplayName("5장 $5 + 10CHF = $10(환율이 2:1일경우)")
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.time(2));
        assertEquals(new Franc(15), five.time(3));
    }


}
