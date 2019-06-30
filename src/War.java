import java.util.ArrayList;
import java.util.List;

public class War {
    List<Card> player1Deck;
    List<Card> player2Deck;
    Deck deck;
    int warCount = 0;

    public War(){
        player1Deck = new ArrayList<>();
        player2Deck = new ArrayList<>();
        deck = new Deck();
    }

    public void deal(){
        deck.shuffle();
        for(int i = 0; i < 26; i++){
            player1Deck.add(deck.giveCard());
            player2Deck.add(deck.giveCard());
        }
    }

    public void showDecks(){
        System.out.println("Player 1 cards(" + player1Deck.size() + "): ");
        for(int i = 0; i < player1Deck.size(); i++)
            System.out.print(player1Deck.get(i) + "    ");
        System.out.println();

        System.out.println("Player 2 cards(" + player2Deck.size() + "): ");
        for(int i = 0; i < player2Deck.size(); i++)
            System.out.print(player2Deck.get(i) + "    ");
        System.out.println();
    }

    public void fight(){
        System.out.println("Player 1 card: " + player1Deck.get(warCount*2));
        System.out.println("Player 2 card: " + player2Deck.get(warCount*2));

        if(player1Deck.get(warCount*2).getRank() > player2Deck.get(warCount*2).getRank()){
            System.out.println("Player 1 wins!");
            for(int i = 0; i <= warCount*2; i++){
                player1Deck.add(player1Deck.get(i));
                player1Deck.add(player2Deck.get(i));
            }

            for(int i = 0; i <= warCount*2; i++){
                player1Deck.remove(0);
                player2Deck.remove(0);
            }
            warCount = 0;
        }
        else if(player2Deck.get(warCount*2).getRank() > player1Deck.get(warCount*2).getRank()){
            System.out.println("Player 2 wins!");
            for(int i = 0; i <= warCount*2; i++){
                player2Deck.add(player2Deck.get(i));
                player2Deck.add(player1Deck.get(i));
            }

            for(int i = 0; i <= warCount*2; i++){
                player1Deck.remove(0);
                player2Deck.remove(0);
            }
            warCount = 0;
        }
        else{
            warCount++;
            System.out.println(warCount + " WAR!");
            fight();
        }
    }

}
