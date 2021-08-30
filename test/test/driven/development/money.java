package test.driven.development;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class money {


    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.time(2);
        Assertions.assertEquals(10, five.amount);
    }


}
