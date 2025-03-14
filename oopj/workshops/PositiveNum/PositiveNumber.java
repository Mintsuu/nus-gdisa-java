class PositiveNumber {
  private int n;
  
  public PositiveNumber(int value) {
    this.n = value;
  }

  public boolean setN(int value) {
    if(value < 0) return false;
    this.n = value;

    return true;
  }

  public int getN() {
    return this.n; 
  }
}
