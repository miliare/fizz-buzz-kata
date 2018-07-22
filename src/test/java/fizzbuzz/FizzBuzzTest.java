package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test(expected = FizzBuzzException.class)
    public void should_throw_a_fizzbuzz_exception_if_number_superior_to_100() throws FizzBuzzException {
        fizzBuzz.runWithNumber(102);
    }

    @Test(expected = FizzBuzzException.class)
    public void should_throw_a_fizzbuzz_exception_if_number_inferior_to_0() throws FizzBuzzException {
        fizzBuzz.runWithNumber(-2);
    }

    @Test
    public void should_print_Fizz_if_number_is_divisable_by_3() throws FizzBuzzException {
        assertThat(fizzBuzz.runWithNumber(3)).isEqualTo(FIZZ);
    }

    @Test
    public void should_print_Buzz_if_number_is_divisable_by_5() throws FizzBuzzException {
        assertThat(fizzBuzz.runWithNumber(5)).isEqualTo(BUZZ);
    }

    @Test
    public void should_print_FizzBuzz_if_number_is_divisable_by_5() throws FizzBuzzException {
        assertThat(fizzBuzz.runWithNumber(15)).isEqualTo(FIZZ_BUZZ);
    }
}
