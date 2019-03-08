package za.ca.cput.kaylinmorkelassignment3tdd.Part2;

//Kaylin Morkel - 215062175

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeCalculatorTest
{
    AgeCalculator ageCalc;

    @Before
    public void setUp() throws Exception
    {
        ageCalc = new AgeCalculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void determineAge() throws Exception
    {
        int ageResult = ageCalc.determineAge(1996, 2019);
        Assert.assertEquals(23, ageResult);
    }
    @Test
    public void determineAge1() throws Exception
    {
        int ageResult2 = ageCalc.determineAge(2018, 2019);
        Assert.assertEquals(1, ageResult2);
    }
}