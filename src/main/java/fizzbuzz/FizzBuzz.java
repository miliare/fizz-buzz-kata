package fizzbuzz;

import static java.lang.String.valueOf;

class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    String runWithNumber(int number) throws FizzBuzzException {
        if (number < 0 || number > 100) {
            throw new FizzBuzzException();
        }
        if (number % 3 == 0 && number % 5 == 0)
            return FIZZ_BUZZ;
        else if (number % 3 == 0)
            return FIZZ;
        else if (number % 5 == 0)
            return BUZZ;
        else
            return valueOf(number);
    }
}
