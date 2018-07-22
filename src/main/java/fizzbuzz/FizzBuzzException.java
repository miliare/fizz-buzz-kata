package fizzbuzz;

class FizzBuzzException extends Throwable {

    FizzBuzzException() {
        System.out.println("You should pass a number between 0 and 100");
    }
}
