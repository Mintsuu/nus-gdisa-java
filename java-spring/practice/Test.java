class Test {
  public static void main(String[] args) {
    Integer[] test = new Integer[]{1,4,5,6,7,8,2}; 
    System.out.println(checkElement(test, 4));
  }

  static public <T> boolean checkElement(T[] elements, T search) {
    for(int x = 0; x < elements.length; x++) {
      if(elements[x].equals(search)) return true;
    }

    return false;
  }
}
