package fizzbuzz;



class FizzBuzz {
    String run(int number) {
        return Operator.of(number).compute(number);
    }
}
