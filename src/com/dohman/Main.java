package com.dohman;

public class Main {
    public static void main(String[] args) {

        //CREATE PLAYERS, 1-infinite
        Player playerone = new Player("David", 0);
        Player playertwo = new Player("Stina", 0);

        //SET NUMBERS OF GUESSES
        System.out.println(playerone.getName() + "'s turn");
        playerone.Guess();

        System.out.println(playertwo.getName() + "'s turn");
        playertwo.Guess();

        System.out.println(playerone.getName() + "'s turn");
        playerone.Guess();

        System.out.println(playertwo.getName() + "'s turn");
        playertwo.Guess();

        //END GAME
        System.out.println(playerone.getName() + " got " + playerone.getPoints() + " points!");
        System.out.println(playertwo.getName() + " got " + playertwo.getPoints() + " points!");
    }
}
