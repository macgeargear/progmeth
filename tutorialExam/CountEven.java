public class CountEven {
    public static int countEven(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}