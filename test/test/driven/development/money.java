package test.driven.development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class money {


    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.time(2);
        assertEquals(10, product.amount);

        product = five.time(3);
        assertEquals(15, product.amount);
    }

    @Test
    @DisplayName("3장 동일성 체크")
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }


}
