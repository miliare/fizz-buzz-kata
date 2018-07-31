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

    @Test
    public void should_print_string_number() {
        assertThat(fizzBuzz.run(1)).isEqualTo("1");
    }

    @Test
    public void should_print_Fizz_if_number_is_divisible_by_3() {
        assertThat(fizzBuzz.run(3)).isEqualTo(FIZZ);
    }

    @Test
    public void should_print_Buzz_if_number_is_divisible_by_5() {
        assertThat(fizzBuzz.run(5)).isEqualTo(BUZZ);
    }

    @Test
    public void should_print_FizzBuzz_if_number_is_divisible_by_5() {
        assertThat(fizzBuzz.run(15)).isEqualTo(FIZZ_BUZZ);
    }
}
