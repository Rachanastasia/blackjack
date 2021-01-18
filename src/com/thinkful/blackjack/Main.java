package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args){
        Card aceSpades = new Card();
        Card sevenSpades = new Card("7", "Spades", 8, false);
        Card jackClubs = new Card("Jack", "Clubs", 10, true);

        sevenSpades.setSuit("Spades");
        sevenSpades.setCardFace("7");

        jackClubs.setSuit("Clubs");
        jackClubs.setCardFace("Jack");

        System.out.printf("Card: %s of %s\n", sevenSpades.getCardFace(), sevenSpades.getSuit());
        System.out.printf("Card: %s of %s\n", jackClubs.getCardFace(), jackClubs.getSuit());
        System.out.printf("Card: %s of %s\n", aceSpades.getCardFace(), aceSpades.getSuit());
    }
}
