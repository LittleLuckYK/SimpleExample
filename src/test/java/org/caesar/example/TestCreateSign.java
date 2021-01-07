package org.caesar.example;

import org.testng.annotations.Test;
import org.caesar.example.utils.CreateSign;

public class TestCreateSign {
    @Test
    public void testSign()
    {
        System.out.println(new CreateSign().sign("hey girl"));

    }
}
