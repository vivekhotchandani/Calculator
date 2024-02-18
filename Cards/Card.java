// Represents a single playing card
public class Card {
    private String suit; // The suit of the card (e.g., "Hearts", "Clubs")
    private String rank; // The rank of the card (e.g., "Ace", "2", "King")

    // Constructor to create a card with a given suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method for the suit of the card
    public String getSuit() {
        return suit;
    }

    // Setter method for the suit of the card
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter method for the rank of the card
    public String getRank() {
        return rank;
    }

    // Setter method for the rank of the card
    public void setRank(String rank) {
        this.rank = rank;
    }

    // Method to represent the card as a string
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
