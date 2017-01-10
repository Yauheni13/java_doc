package us.va.yauheni;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrime {
    @Test(enabled = false)
    public void testPrimeW2(){
        Assert.assertTrue(Prime.isPrimeW2(Integer.MAX_VALUE));
    }
    @Test
    public void testPrimeFor(){
        Assert.assertTrue(Prime.isPrime(Integer.MAX_VALUE));
    }
    @Test
    public void testPrimeFor2(){
        Assert.assertTrue(Prime.isPrime2(Integer.MAX_VALUE));
    }
    @Test
    public void testPrimeForSqr(){
        Assert.assertTrue(Prime.isPrimeSqr(Integer.MAX_VALUE));
    }

}
