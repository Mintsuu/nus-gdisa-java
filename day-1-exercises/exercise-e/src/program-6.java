

class PerfectPrintThousand {
    public static void main(String[] args) {
        for(int x = 1; x < 1000; x++) {
            int value = isPerfectNumber(x);
            if(value != 0) System.out.println(value);
        }
    }

    private static int isPerfectNumber(int value) {
        int sum = 0;

        for(int x = 1; x < value; x++) {
            if(value % x == 0) sum += x;
        }

        return value == sum ? value : 0;
    }
}