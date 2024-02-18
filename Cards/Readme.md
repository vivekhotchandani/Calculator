Card Deck Java Program
Introduction
This Java program simulates a standard 52-card deck and provides various functionalities such as shuffling the deck, dealing cards, and finding cards with the same suit or rank. It consists of three classes: Card.java, Deck.java, and Main.java.

Card.java
The Card.java class represents a single playing card. It has two private fields, suit and rank, and provides getter and setter methods for these fields. The toString method is overridden to return the card's suit and rank in the format "Rank of Suit".

Deck.java
The Deck.java class represents a deck of playing cards. It contains an ArrayList of Card objects to store the cards in the deck. The createDeck method populates the deck with 52 cards, the shuffleDeck method shuffles the deck, the printDeck method prints the entire deck, the showCard method prints the first card in the deck, and the getDeck method returns the entire deck.

Main.java
The Main.java class contains the main method, which creates a deck, prints it, shuffles it, and then performs various operations on it. The sameCard, compareCard, findCard, and dealCard methods are defined within the Main class to perform the respective operations on the deck of cards.
