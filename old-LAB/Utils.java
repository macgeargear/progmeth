public class Utils {
    public static int random(int first, int last) {
        return first + (int)(Math.random()*(last-first));
    }
    public static int random(int n) {
        return random(0, n);
    }
}
