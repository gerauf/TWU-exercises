/**
 * Created by fergyo on 15/12/2016.
 */
public class FizzBuzz {

    String generate(int number){
        if (divisibleBy(number, 15)) return "FizzBuzz";
        if (divisibleBy(number, 3)) return "Fizz";
        if (divisibleBy(number, 5)) return "Buzz";
        return Integer.toString(number);
    }

    private boolean divisibleBy(int number, int divisor) {
        if(number % divisor == 0) return true;
        return false;
    }
}
