import java.util.ArrayList;
import java.util.Collections;

// Represents a deck of playing cards
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>(); // The cards in the deck

    // Method to create a new deck of cards
    public void createDeck() {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

        // Create a card for each rank and suit combination
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Method to shuffle the deck of cards
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // Method to print the entire deck of cards
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // Method to show the first card in the deck
    public void showCard() {
        System.out.println(cards.get(0));
    }

    // Method to get the deck of cards
    public ArrayList<Card> getDeck() {
        return cards;
    }
}
