import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fergyo on 15/12/2016.
 */
public class FizzBuzzTest {

    FizzBuzz fb = new FizzBuzz();

    @Test
    public void fizzbuzzOfOneReturnsOne(){
        assertEquals(fb.generate(1), "1");
    }


    @Test
    public void fizzbuzzOfTwoReturnsTwo(){
        assertEquals(fb.generate(2), "2");
    }


    @Test
    public void fizzbuzzOfMultipleofFiveReturnsBuzz(){
        assertEquals(fb.generate(5), "Buzz");
        assertEquals(fb.generate(10), "Buzz");
    }

    @Test
    public void fizzbuzzOfMultipleOfThreeReturnsFizz(){
        assertEquals(fb.generate(3), "Fizz");
        assertEquals(fb.generate(6), "Fizz");
    }

    @Test
    public void fizzbuzzOfMultipleOfFifteenReturnsFizzBuzz(){
        assertEquals(fb.generate(15), "FizzBuzz");
        assertEquals(fb.generate(30), "FizzBuzz");
    }


}