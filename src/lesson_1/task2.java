void main() {
    int count = 0;
    System.out.println("Числа, соблюдающие два условия: ");

    for (int number = 100; number <= 999; number++) {
        if (number % 10 != 0) {
            continue;
        }
        int sumDivisors = calSumDiv(number);

        if (sumDivisors % 10 == 0) {
            count++;
            System.out.println(number);
        }
    }
}

 int calSumDiv(int number) {
    int sum = 0;

    for (int divisor = 1; divisor <= number; divisor++) {
        if (number % divisor == 0) {
            if (divisor % 2 != 0) {
                sum += divisor;
            }
        }
    }
    return sum;
}