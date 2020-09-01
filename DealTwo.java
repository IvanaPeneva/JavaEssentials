import java.util.Scanner;

public class DealTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardsPerPlayer = 5;
        int players = scanner.nextInt();

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        if (cardsPerPlayer*players >SUITS.length * RANKS.length )
            throw new RuntimeException("Too many players");

        String[] deck = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        int n = deck.length; //int n=SUITS.length*RANKS.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i=0; i<players*cardsPerPlayer;i++){
            System.out.println(deck[i]);
            if (i%cardsPerPlayer==cardsPerPlayer-1){
                System.out.println();
            }
        }
    }
}
