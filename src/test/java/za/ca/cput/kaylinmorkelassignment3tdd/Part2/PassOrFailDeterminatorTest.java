package za.ca.cput.kaylinmorkelassignment3tdd.Part2;

//Kaylin Morkel - 215062175

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassOrFailDeterminatorTest
{
    PassOrFailDeterminator pOF;

    @Before
    public void setUp() throws Exception
    {
        pOF = new PassOrFailDeterminator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void passOrFail() throws Exception
    {
        String progress = pOF.passOrFail(50);
        Assert.assertEquals("Pass", progress);
    }
    @Test
    public void passOrFail2() throws Exception
    {
        String progress2 = pOF.passOrFail(5);
        Assert.assertEquals("Fail", progress2);
    }
}