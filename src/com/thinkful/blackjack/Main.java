package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args){
        Card aceSpades = new Card();
        Card sevenSpades = new Card("7", "Spades", 8, false);
        Card jackClubs = new Card("Jack", "Clubs", 10, true);

        sevenSpades.suit = "Spades";
        sevenSpades.cardFace = "7";

        jackClubs.suit = "Clubs";
        jackClubs.cardFace = "Jack";

        System.out.printf("Card: %s of %s\n", sevenSpades.cardFace, sevenSpades.suit);
        System.out.printf("Card: %s of %s\n", jackClubs.cardFace, jackClubs.suit);
    }
}
