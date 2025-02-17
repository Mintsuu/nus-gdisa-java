class Factorial {
 public static void main(String[] main) {
  calcIncrementFactorial(3);
  calcDecrementFactorial(3);

}

  private static void calcIncrementFactorial(int input) {
    int output = 1;
    for(int i = 1; i <= input; i++) {
      output = output * i;
    }

    System.out.println(output);
  }

  private static void calcDecrementFactorial(int input) {
    int output = input;
    for(int i = input - 1; i >= 1; i--) {
      output = output * i;
    }

    System.out.println(output);
  }
}
