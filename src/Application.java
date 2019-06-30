import java.io.*;
import java.util.*;

public class Application {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        War game = new War();
        game.deal();
        game.showDecks();
        while(game.player1Deck.size() != 0 && game.player2Deck.size() != 0){
            game.fight();
            game.showDecks();
            //scan.next();
        }
        if(game.player1Deck.size() == 52)
            System.out.println("PLAYER 1 IS A WINNER");
        else
            System.out.println("PLAYER 2 IS A WINNER");
    }
}
