package com.mahendra;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCase {
	Calculator calc = new Calculator();
    @BeforeTest
    public void doSomethingBefore() {
        System.out.println("The beforeTest method.....");
    }
    
    @AfterTest
    public void doSomethingAfter() {
        System.out.println("The afterTest method....");
    }
    
    @Test
    public void testSum() {
        int ans = calc.doSum(10, 12);
        Assert.assertEquals(ans,22);
    }
    
    @Test
    public void testSub() {
        int ans = calc.doSub(10, 12);
        Assert.assertEquals(ans,-2);
    }
    
    @Test
    public void testDiv() {
        int ans = calc.doDiv(10, 2);
        Assert.assertEquals(ans,5);
    }
    @Test
    public void testMult() {
        int ans = calc.doMult(10, 2);
        Assert.assertEquals(ans,20);
    }
}
