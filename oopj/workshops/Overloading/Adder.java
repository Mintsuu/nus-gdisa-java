public class Adder {
  // overloading for integer addition
  public long add(int x1, int x2) {
    // add two integers
    return x1 + x2;
  }

  // overloading for string concatenation
  public String add(String s1, String s2) {
    // concatenate two strings
    return s1.concat(s2);
  }

  public Color add(Color c1, Color c2) {
    String c1Color = c1.getColor().toLowerCase();
    String c2Color = c2.getColor().toLowerCase();
    Color unknownColor = new Color("Unknown");

    System.out.println(c1Color.contains("red"));
    System.out.println(c2Color.contains("blue"));
    

    if(!c1Color.contains("red") || !c1Color.contains("blue") || !c1Color.contains("green")) return unknownColor; 
    if(!c2Color.contains("red") || !c2Color.contains("blue") || !c2Color.contains("green")) return unknownColor;

    if((c1Color.contains("red") && c2Color.contains("blue")) || (c1Color.contains("blue") && c2Color.contains("red") )) return new Color("Magenta");
    if((c1Color.contains("red") && c2Color.contains("green")) || (c1Color.contains("green") && c2Color.contains("red") )) return new Color("Yellow");
    if((c1Color.contains("green") && c2Color.contains("blue")) || (c1Color.contains("blue") && c2Color.contains("green") )) return new Color("Cyan");

    return unknownColor;
  }
}
