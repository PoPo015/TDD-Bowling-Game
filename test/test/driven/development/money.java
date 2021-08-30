package test.driven.development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class money {


    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.time(2);
        assertEquals(10, product.amount);

        product = five.time(3);
        assertEquals(15, product.amount);

    }


}
