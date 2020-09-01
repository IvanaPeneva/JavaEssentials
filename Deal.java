import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cardsPerPlayer=5;
        int players=scanner.nextInt();

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"};

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int n=SUITS.length*RANKS.length;

        if (cardsPerPlayer*players>n){
            throw new RuntimeException("Too many players");
        }
        String[] deck=new String[n];
        for (int i=0; i<RANKS.length;i++){
            for (int k=0;k<SUITS.length;k++){
                deck[SUITS.length*i+k]= RANKS[i]+ " of "+ SUITS[k];
            }
        }
        for (int i=0;i<n;i++){
            int r=i+ (int) (Math.random()*(n-1));
            String temp=deck[r];
            deck[r]=deck[i];
            deck[i]=temp;
        }
        for (int i=0;i<players*cardsPerPlayer;i++){
            System.out.println(deck[i]);
            if (i%cardsPerPlayer==cardsPerPlayer-1){
                System.out.println();
            }
        }

    }

}
