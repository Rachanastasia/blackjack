package com.thinkful.blackjack;

public class TryItOut {
    public static void main(String[] args){
        Card c1 = new Card(Face.ACE, Suit.CLUBS);
        Card c2 = new Card(Face.ACE, Suit.CLUBS);
        Card c3 = c1;

        Card c4 = new Card(Face.FOUR, Suit.CLUBS);
    }
}
