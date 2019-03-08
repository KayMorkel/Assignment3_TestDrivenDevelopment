package za.ca.cput.kaylinmorkelassignment3tdd.Part2;

//Kaylin Morkel - 215062175

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.sql.rowset.spi.SyncResolver;

import static org.junit.Assert.*;

public class ExamPercentageCalculatorTest
{
    ExamPercentageCalculator examPerc;

    @Before
    public void setUp() throws Exception
    {
        examPerc = new ExamPercentageCalculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void percentageCalc() throws Exception
    {
        int percentage = examPerc.percentageCalc(50, 20);
        //System.out.println(percentage);
        Assert.assertEquals(40, percentage);
    }
    @Test
    public void percentageCalc2() throws Exception
    {
        int percentage2 = examPerc.percentageCalc(30, 30);
        //System.out.println(percentage2);
        Assert.assertEquals(100, percentage2);
    }
}