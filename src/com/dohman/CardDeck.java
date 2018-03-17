package com.dohman;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {

    ArrayList<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();

        for (int i = 2; i < 15; i++) {
            Card card = new Card(i, "Hearts");
            cards.add(card);
        }

        for (int i = 2; i < 15; i++) {
            Card card = new Card(i, "Diamonds");
            cards.add(card);
        }

        for (int i = 2; i < 15; i++) {
            Card card = new Card(i, "Spades");
            cards.add(card);
        }

        for (int i = 2; i < 15; i++) {
            Card card = new Card(i, "Clubs");
            cards.add(card);
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        return (cards.get(random.nextInt(cards.size())));
    }
}