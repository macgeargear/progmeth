package cardlab;
public class Utils {
    public static boolean checkRank(String rank) {
        return (rank.equals("2") || rank.equals("3") || rank.equals("4") ||
            rank.equals("5") || rank.equals("6") || rank.equals("7") ||
            rank.equals("8") || rank.equals("9") || rank.equals("10") || 
            rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")
        );
    }

    public static boolean checkSuit(String suit) {
        return (suit.equals("spades") || suit.equals("heart") || suit.equals("diamond") || suit.equals("club"));
    }

    public static int getValue(String rank) {
        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            return 10;
        } else if (rank.equals("A")) {
            return 11;
        } else if (Utils.checkRank(rank)) {
            return Integer.parseInt(rank);
        } else {
            System.out.println("Cannot convert wrong rank");
            System.exit(0);
            return 0;
        }
    }
    public static int random(int first, int last) {
        return first + (int)(Math.random()*(last-first));
    }

    public static int random(int n) {
        return random(0, n);
    }


 
}
