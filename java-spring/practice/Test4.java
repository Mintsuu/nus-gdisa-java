import java.util.function.Function;

class Test {
  public static void main(String[] args) {
    Function<Integer, Integer> test = (a) -> a;
  }
  public int pow(int base, int exp) {
    int res = 1;
    for (int i = 0; i < exp; i++) {
      res *= base;
    }
    return res;
  }
}
