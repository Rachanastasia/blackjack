package com.thinkful.blackjack;

public class Card {
    private Suit suit;
    private Face cardFace;
    private int value;
    private boolean turnedUp;

    public Suit getSuit(){
        return suit;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public Face getCardFace(){
        return cardFace;
    }

    public void setCardFace(Face cardFace){
        this.cardFace = cardFace;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public boolean isTurnedUp(){
        return turnedUp;
    }

    public void setTurnedUp(boolean turnedUp){
        this.turnedUp = turnedUp;
    }

    public Card(){
        this(Face.ACE, Suit.SPADES, 1, false);
    }
    public Card(Face cardFace, Suit suit){
        this(cardFace, suit, 1, false);
    }
    public Card(Face cardFace, Suit suit, int value, boolean turnedUp){
        this.setSuit(suit);
        this.setCardFace(cardFace);
        this.setValue(value);
        this.setTurnedUp(turnedUp);
    }


}
