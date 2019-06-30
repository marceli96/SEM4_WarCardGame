public class Card {
    private String color;
    private String figure;
    private int rank;

    public Card(String color, String figure){
        this.color = color;
        this.figure = figure;

        if (figure == "2")
            rank = 1;
        else if (figure == "3")
            rank = 2;
        else if (figure == "4")
            rank = 3;
        else if (figure == "5")
            rank = 4;
        else if (figure == "6")
            rank = 5;
        else if (figure == "7")
            rank = 6;
        else if (figure == "8")
            rank = 7;
        else if (figure == "9")
            rank = 8;
        else if (figure == "10")
            rank = 9;
        else if (figure == "J")
            rank = 10;
        else if (figure == "Q")
            rank = 11;
        else if (figure == "K")
            rank = 12;
        else if (figure == "A")
            rank = 13;
    }

    public String getColor() {
        return color;
    }

    public String getFigure() {
        return figure;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return figure + " " + color;
    }
}
