public class PositiveNumber {
  private int n;

  public  PositiveNumber(int val) {
    this.n = val;
  }

  public boolean setN(int val) {
    if(val > 0) {
      this.n = val;
      return true;
    } else {
      return false; 
    }
  }

  public int getN() {
    return this.n;
  }

}
