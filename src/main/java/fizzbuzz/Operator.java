package fizzbuzz;

import java.util.Optional;
import java.util.function.Function;

import static java.util.Arrays.stream;

enum Operator {

    FIZZ_BUZZ((number) -> isDivisibleBy3(number) && isDivisibleBy5(number), (number) -> "FizzBuzz"),
    FIZZ(Operator::isDivisibleBy3, (number) -> "Fizz"),
    BUZZ(Operator::isDivisibleBy5, (number) -> "Buzz"),
    NUMBER((number) -> true, String::valueOf);

    private Function<Integer, Boolean> condition;
    private Function<Integer, String> operation;

    Operator(Function<Integer, Boolean> condition, Function<Integer, String> operation) {
        this.condition = condition;
        this.operation = operation;
    }

    public static Operator of(Integer op) {
        return findOperatorByNumber(op).orElse(null);
    }

    private static Optional<Operator> findOperatorByNumber(Integer number) {
        return stream(values()).filter(operator -> operator.condition.apply(number)).findAny();
    }

    private static boolean isDivisibleBy3(Integer number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleBy5(Integer number) {
        return number % 5 == 0;
    }

    public String compute(Integer number) {
        return operation.apply(number);
    }
}
