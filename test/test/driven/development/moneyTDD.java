package test.driven.development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class moneyTDD {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.time(2));
        assertEquals(Money.dollar(15), five.time(3));
    }

    @Test
    @DisplayName("3장 동일성(equals) 체크")
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

    }

    @Test
    @DisplayName("5장 $5 + 10CHF = $10(환율이 2:1일경우)")
    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.time(2));
        assertEquals(Money.franc(15), five.time(3));
    }

    @Test
    @DisplayName("7장 Franc와 Dollar 비교")
    public void FrancAndDollarEqulas() {
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

}

