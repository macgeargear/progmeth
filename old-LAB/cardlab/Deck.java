package cardlab;

public class Deck {
    private Card[] cards;
    private int currentIndex;
    private String currentRank;
    private String currentSuit;

    public Deck() {
        Card[] cards = new Card[52];
        String currentRank = "2";
        String currentSuit = "spades";
        int currentIndex = 0;

        for (int i=1; i<=13; i++) {
            for (int j=1; j<=4; j++) {
                cards[this.currentIndex++] = new Card(currentRank, currentSuit);
                this.currentRank = this.nextRank(this.currentRank);
                this.currentSuit = this.nextSuit(this.currentSuit);
            }
        }
    }
    private String nextRank(String rank) {
        int temp;
        if (rank.equals("10")) {
            return "J";
        } else if (rank.equals("J")) {
            return "Q";
        } else if (rank.equals("Q")) {
            return "K";
        } else if (rank.equals("K")) {
            return "A";
        } else if (rank.equals("A")) {
            return "2";
        } else {
            temp = Integer.parseInt(rank);
            temp++;
            return String.valueOf(temp);
        }
    }

    private String nextSuit(String s) {
        if (s.equals("spades")) {
            return "heart";
        } else if (s.equals("heart")) {
            return "diamond";
        } else if (s.equals("diamond")) {
            return "club";
        } else {
            return "spades";
        }
    }
    
    // TODO: shuffle
    private void shuffle() {
        int temp;
        Card tempCard;
        for (int i=0; i<52; i++) {
            temp = Utils.random(0, 52);
            tempCard = this.cards[i];
            this.cards[i] = this.cards[temp];
            this.cards[temp] = tempCard;
        }
    }

    // TODO: pick
    private Card pick() {
        Card result = this.cards[0];
        if (result == null) {
            System.out.println("No more cards, exit.");
            System.exit(0);
        }

        Card[] newCards = new Card[52];
        int newCardsIndex = 0;

        // copy from the 2nd element onward
        for (int i=1; i<52; i++) {
            newCards[newCardsIndex] = this.cards[i];
            newCardsIndex++;
        }
        cards = newCards;
        return result;
    }

    // not used in this lav
    private void cut() {
        int n_cards = Utils.random(0, 51);
        Card[] newCards = new Card[52];
        int newCardsIndex = 0;

        // copy from nth element
        for (int i=n_cards; i<52; i++) {
            newCards[newCardsIndex++] = cards[i];
        }

        // copy from 1st
        for (int i=0; i<n_cards; i++) {
            newCards[newCardsIndex++] = cards[i];
        }

        cards = newCards;
    }
    
    public void playCard(Deck p2) {
        Card p1FirstCard, p1SecondCard, p2FirstCard, p2SecondCard;
        int p1Rank, p2Rank;
        boolean end = false;

        while (!end) {
            p1FirstCard = this.pick();
            p1SecondCard = this.pick();
            p2FirstCard = p2.pick();
            p2SecondCard = p2.pick();

            p1Rank = p1FirstCard.combineRank(p1SecondCard);
            p2Rank = p2FirstCard.combineRank(p2SecondCard);

            if (p1Rank > p2Rank) {
                System.out.println(" P1 wins");
            } else if (p2Rank > p1Rank) {
                System.out.println(" P2 wins");
            } else {
                System.out.println("Draw - this round.");
            }
        }
    }


    public static void main(String[] args) {
        Deck player1 = new Deck();
        Deck player2 = new Deck();

        player1.shuffle();
        player2.shuffle();
        player1.cut();
        player2.cut();

        player1.playCard(player2);

    }
}
