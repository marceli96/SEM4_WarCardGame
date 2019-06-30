import java.util.Random;

public class Deck {
    Card deck[];
    int actualCard;
    Random generator = new Random();

    public Deck(){
        actualCard = 0;
        String colors[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String figures[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        deck = new Card[52];

        for(int i = 0; i < 52; i++)
            deck[i] = new Card(colors[i / 13], figures[i % 13]);
    }

    public void shuffle(){
        for(int i = 0; i < 52; i++){
            int randomNumber = generator.nextInt(52);
            Card tempCard = deck[randomNumber];
            deck[randomNumber] = deck[i];
            deck[i] = tempCard;
        }
    }

    public Card giveCard(){
        Card tempCard = deck[actualCard];
        actualCard++;
        return tempCard;
    }

    public void show(){
        for(int i = 0; i < 52; i++){
            System.out.println(i + 1 + ": " + deck[i].getFigure() + " " + deck[i].getColor());
        }
    }
}
