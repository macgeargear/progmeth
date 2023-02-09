package cardlab;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // getter & setter
    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        // can only contain legal rank
        if (Utils.checkRank(rank)) {
            this.rank = rank;
        } else {
            System.out.println("Wrong Rank input!!");
            System.exit(0);
        }
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        if (Utils.checkSuit(suit)) {
            this.suit = suit;
        } else {
            System.out.println("Wrong Suit input!!");
            System.exit(0);
        }
    }
     
    public int combineRank(Card c) {
        // convert rank to int
        int first = Utils.getValue(rank);

        // rork out the rank of the second card
        int second = 0;
        String otherRank = c.getRank();
        second = Utils.getValue(otherRank);

        // combine
        int result = first + second;
        if (result == 22) {
            return 12;
        }
        return result;
    }
}
