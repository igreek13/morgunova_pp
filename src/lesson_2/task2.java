void printDig(int n) {
    if (n < 10) {
        System.out.print(n);
        return;
    }
    printDig(n / 10);
    System.out.print(" " + (n % 10));
}

void main() {
    System.out.println("Вывод цифр числа 987678:");
    printDig(987678);
    System.out.println();

    System.out.println("Вывод цифр числа 1000:");
    printDig(1000);
    System.out.println();
}