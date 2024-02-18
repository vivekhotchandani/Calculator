/*Name- Vivek Hotchandani
PRN - 22070126133
Batch - AIML-B3
*/

import java.util.*;

// The main class to run the program
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Create a new deck of cards

        // Create the deck, print it, shuffle it, and print it again
        System.out.println("_________Creating Deck_________");
        deck.createDeck();
        System.out.println("_______Printing Deck________");
        deck.printDeck();
        System.out.println("_______Shuffling Deck________");
        deck.shuffleDeck();
        System.out.println("_______Printing Shuffled Deck________");
        deck.printDeck();

        System.out.println("_______Printing Card________");
        deck.showCard(); // Print the first card in the deck

        // Perform various operations on the deck of cards
        System.out.println("_______Same Card________");
        sameCard(deck.getDeck());
        System.out.println("_______Compare Card________");
        compareCard(deck.getDeck());
        System.out.println("_______Find Card________");
        findCard(deck.getDeck());
        System.out.println("_______Deal Card________");
        dealCard(deck.getDeck());
    }

    // Method to find cards with the same suit
    public static void sameCard(ArrayList<Card> cards) {
        for (Card card : cards) {
            for (Card innerCard : cards) {
                if (card.getSuit().equals(innerCard.getSuit()) && !card.equals(innerCard)) {
                    System.out.println("Same suit: " + card + " and " + innerCard);
                }
            }
        }
    }

    // Method to find cards with the same rank
    public static void compareCard(ArrayList<Card> cards) {
        for (Card card : cards) {
            for (Card innerCard : cards) {
                if (card.getRank().equals(innerCard.getRank()) && !card.equals(innerCard)) {
                    System.out.println("Same rank: " + card + " and " + innerCard);
                }
            }
        }
    }

    // Method to find a card with a specific rank
    public static void findCard(ArrayList<Card> cards) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rank of card to find: ");
        String rank = scanner.nextLine();
        for (Card card : cards) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found with the given rank.");
    }

    // Method to deal a random set of 5 cards from the deck
    public static void dealCard(ArrayList<Card> cards) {
        Random rand = new Random();
        int n = cards.size();
        System.out.println("Dealt cards: ");
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(n);
            System.out.println(cards.remove(index));
            n--;
        }
    }
}
