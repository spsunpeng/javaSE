package com.my.test;

import com.my.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void AddTest(){
        Calculator calculator = new Calculator();
        int result = calculator.Add(4,5);
        System.out.println(result);
        Assert.assertEquals(9,result);
    }
}
