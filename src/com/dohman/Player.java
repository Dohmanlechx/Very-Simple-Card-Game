package com.dohman;

import java.util.Scanner;

public class Player {
    protected String name;
    protected int points;


    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void Guess() {
        CardDeck deck = new CardDeck();

        while (true) {
            Card oldCard = deck.getRandomCard();
            Card newCard = deck.getRandomCard();
            System.out.println("Current card is " + oldCard);
            System.out.println("Shall the next card be 1: Higher or 2: Lower?");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1) {
                if (newCard.getValue() > oldCard.getValue()) {
                    boolean isHigher = true;
                    if (isHigher == true) {
                        System.out.println("Next card: " + newCard);
                        points++;
                        System.out.println("Points: +1 (" + points + ")");
                    }
                } else if (newCard.getValue() == oldCard.getValue()) {
                    System.out.println("New card: " + newCard);
                    System.out.println("Even value. Try again.");
                } else {
                    System.out.println("Next card: " + newCard);
                    System.out.println("Sorry! " + getName() + "'s current points: " + points + "\n");
                    break;
                }
            } else if (input == 2) {
                if (newCard.getValue() < oldCard.getValue()) {
                    boolean isHigher = false;
                    if (isHigher == false) {
                        System.out.println("Next card: " + newCard);
                        points++;
                        System.out.println("Points: +1 (" + points + ")");
                    }
                } else if (newCard.getValue() == oldCard.getValue()) {
                    System.out.println("New card: " + newCard);
                    System.out.println("Even value. Try again.");
                } else {
                    System.out.println("Next card: " + newCard);
                    System.out.println("Sorry! " + getName() + "'s current points: " + points + "\n");
                    break;
                }
            } else {
                System.out.println("Error, invalid input");
            }
        }
    }
}