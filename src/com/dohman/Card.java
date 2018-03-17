package com.dohman;

public class Card {
    protected int value;
    protected String suit;

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return suit + " " + Integer.toString(value);
    }
}
