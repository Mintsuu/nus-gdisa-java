class InverseSquareRoot {
    public static void main(String[] args) {
     for(int x = 1; x <= 10; x++) {
        double inverse = 1/(double)x;
        double squareRoot = Math.sqrt(x);
        double square = Math.pow(x, 2);
        System.out.printf("No: %.1f, Inverse: %.3f, Square Root: %.3f, Square: %.1f %n", (double)x, inverse, squareRoot, square);
     }   
    }
}