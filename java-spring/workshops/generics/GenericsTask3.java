class GenericsTask3 {
  public static void main(String[] args) {
    Pair<String> fruits = 
    new Pair<String>("apple", "orange");
    System.out.println(fruits.getElement1() + " " +
      fruits.getElement2());
    System.out.println(fruits);

    Pair<Integer> acamiableNumbers = 
    new Pair<Integer>(220, 280);
    System.out.println(acamiableNumbers.getElement1() + " " +
      acamiableNumbers.getElement2());
    System.out.println(acamiableNumbers);
  }
}

class Pair<T> {
  private T element1;
  private T element2;
  public Pair(T element1, T element2) {
    this.element1 = element1;
    this.element2 = element2;
  }

  public T getElement1() {
    return element1;
  }

  public T getElement2() {
    return element2;
  }
}
