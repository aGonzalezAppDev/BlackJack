package com.learntocode;

import java.util.Scanner;

public class Player {
    public Player(){
        String playerName = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        playerName = myScanner.nextLine();
        System.out.println(playerName + " has joined.");

    }


}
