import java.util.ArrayList; import java.util.Arrays;

public class IntList {
  private ArrayList<Integer> list = new ArrayList<>();
  
  public IntList(int[] arr) {
    for(int digits : arr) {
      list.add(digits);
    }
  }

  public void print() {
    System.out.printf("List: %s\n", this.list.toString());
  }

  public float getMean() {
    float sum = 0;
    for(float digits : this.list) {
      sum += digits;
    }
    return sum / list.size();
  }

  public int removeFront(int n) {
    for(int x = 0; x < n; x++) {
      this.list.remove(0);
    }
    return n;
  }

  public int removeBack(int n) {
    for(int x = 0; x < n; x++) {
      this.list.remove(this.list.size() - 1);
    }
    return n;
  }

}
