import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fergyo on 15/12/2016.
 */
public class PrimeFactorsTest {

    PrimeFactors pf = new PrimeFactors();
    List<Integer> result = new ArrayList<>();

    @Test
    public void noPrimeFactorsOfPrimeNumber(){
//        assertEquals(result, pf.generate(1));
//        assertEquals(result, pf.generate(2));
//        assertEquals(result, pf.generate(3));
        assertEquals(result, pf.generate(5));
    }

    @Test
    public void pfOfFourIsTwoAndTwo(){
        result.add(2);
        result.add(2);
        assertEquals(result, pf.generate(4));
    }

    @Test
    public void pfOfSixIsTwoAndThree(){
        result.add(2);
        result.add(3);
        assertEquals(result, pf.generate(6));
    }

    @Test
    public void pfOfEightIsTwoTwoTwo(){
        result.add(2);
        result.add(2);
        result.add(2);
        assertEquals(result, pf.generate(8));
    }

    @Test
    public void pfOfThirtyIsTwoThreeFive(){
        result.add(2);
        result.add(2);
        result.add(2);
        assertEquals(result, pf.generate(8));
    }

}