package io.zipcoder.teamthree.blackjack;

import io.zipcoder.teamthree.blackjack.exceptions.InputMustBeDoubleException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ConsoleTest {

    @Before
    public void setUp(){
    }

    @Test
    public void isInputDouble_PassTest(){

        String input="50";
        boolean actual=Console.isInputDouble(input);
        Assert.assertTrue(actual);

    }

    @Test
    public void isInputDouble_FailTest(){

        String input="asdasda";
        boolean actual=Console.isInputDouble(input);
        Assert.assertFalse(actual);

    }

    @Test
    public void issInputStayOrHit_PassTest(){
        String stay = "stay";
        String hit = "hit";

        Assert.assertTrue(Console.isInputStayOrHit(stay));
        Assert.assertTrue(Console.isInputStayOrHit(hit));
    }

    @Test
    public void isInputStayOrHit_FailTest(){
        String fail = "fail";

        Assert.assertFalse(Console.isInputStayOrHit(fail));
    }

    @Test
    public void makeABetShouldReturn50Test(){
        Double expected = 50d;
        Double actual = Console.makeABet("50");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isInputDoublePositive_PassTest(){
        String input = "50";

        Assert.assertTrue(Console.isInputPositive(input));
    }

    @Test
    public void isInputDoublePositive_FailTest(){
        String input = "-50";

        Assert.assertFalse(Console.isInputPositive(input));
    }

    @Test
    public void issInputYesOrNo_PassTest(){
        String stay = "yes";
        String hit = "no";

        Assert.assertTrue(Console.isInputYesOrNo(stay));
        Assert.assertTrue(Console.isInputYesOrNo(hit));
    }

    @Test
    public void isInputYesOrNo_FailTest(){
        String fail = "fail";

        Assert.assertFalse(Console.isInputStayOrHit(fail));
    }

}
