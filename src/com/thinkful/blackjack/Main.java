package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args){
        Card aceSpades = new Card();
        Card sevenSpades = new Card(Face.SEVEN, Suit.SPADES, 8, false);
        Card jackClubs = new Card(Face.JACK, Suit.CLUBS, 10, true);

        sevenSpades.setSuit(Suit.SPADES);
        sevenSpades.setCardFace(Face.SEVEN);

        jackClubs.setSuit(Suit.CLUBS);
        jackClubs.setCardFace(Face.JACK);

        System.out.printf("Card: %s of %s\n", sevenSpades.getCardFace(), sevenSpades.getSuit());
        System.out.printf("Card: %s of %s\n", jackClubs.getCardFace(), jackClubs.getSuit());
        System.out.printf("Card: %s of %s\n", aceSpades.getCardFace(), aceSpades.getSuit());
    }
}
