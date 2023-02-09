public class PartialArray {
    public static int[] partialArray(int[] a, int i, int j) {
        int n = a.length + (j - i);
        int[] res = new int[n];
        int index = 0;
        if (i < j) {
            for (int x=0; x<a.length; x++) {
                if (x < i || x >= j) {
                    res[index] = a[x];
                }
            }
        }
        return res;
    }
}
