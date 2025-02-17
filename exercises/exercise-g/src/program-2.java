import java.util.Arrays;
class SimplifiedSort {
    public static void main(String[] args) {
        int[] unsorted = new int[]{3, 2, 1, 4 , 0, 5};
        for(int x = 0; x < unsorted.length - 1; x++) {
            for(int y = x + 1; y < unsorted.length; y++) {
                if(unsorted[y] < unsorted[x]) {
                    int oldVal = unsorted[x];
                    int newVal = unsorted[y];
                    unsorted[x] = newVal;
                    unsorted[y] = oldVal;
                }
            }
        }
        System.out.println(Arrays.toString(unsorted));
    }
}