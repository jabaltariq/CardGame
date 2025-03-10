package csf.cardgame;

import java.util.Random;

public class Card {
    protected String image;
    protected int rank;

    public Card() {
        this.image = "ace_of_spades.png";
        rank = 1;
    }

    public Card(int face, int rank) {
        this.rank = rank;
        String cardImage = "";
        switch (face) {
            case 0:
                cardImage = "clubs";
                break;
            case 1:
                cardImage = "hearts";
                break;
            case 2:
                cardImage = "diamonds";
                break;
            case 3:
            default:
                cardImage = "spades";
                break;
        }
        System.out.println(this.rank);
        switch (this.rank) {
            case 1:
                this.image = "ace_of_";
                break;
            case 2:
                this.image = "2_of_";
                break;
            case 3:
                this.image = "3_of_";
                break;
            case 4:
                this.image = "4_of_";
                break;
            case 5:
                this.image = "5_of_";
                break;
            case 6:
                this.image = "6_of_";
                break;
            case 7:
                this.image = "7_of_";
                break;
            case 8:
                this.image = "8_of_";
                break;
            case 9:
                this.image = "9_of_";
                break;
            case 10:
                this.image = "10_of_";
                break;
            case 11:
                this.image = "jack_of_";
                break;
            case 12:
                this.image = "queen_of_";
                break;
            case 13:
            default:
                this.image = "king_of_";
                break;
        }
        this.image = "/images/" + this.image + cardImage + ".png";
    }

    public String getImage() {
        return image;
    }

    public int getRank() {
        return rank;
    }

    public boolean rankIsEqual(int i) {
        return i == this.rank;
    }



}
