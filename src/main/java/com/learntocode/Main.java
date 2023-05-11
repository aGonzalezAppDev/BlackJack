package com.learntocode;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand();
        for(int i = 0; i < 2; i++) {
            // get card from deck
            Card card = deck.deal();
            // deal this card to hand
            hand1.Deal(card);
        }
        hand1.Print();
        int handValue = hand1.getValue();
        System.out.println("Hand is worth " + handValue);
        System.out.println();
        Player player2 = new Player();
        Deck deck2 = new Deck();
        deck2.shuffle();
        Hand hand2 = new Hand();
        for(int i = 0; i < 2; i++) {
            // get card from deck
            Card card2 = deck2.deal();
            // deal this card to hand
            hand2.Deal(card2);
        }
        hand2.Print();
        int handValue2 = hand2.getValue();
        System.out.println("Hand is worth " + handValue2);
        System.out.println("----------------------------------");
        if(handValue <= 21 && (handValue > handValue2 || handValue2 > 21)){
            System.out.println("Player1 is the winner!");
        } else if (handValue2 <= 21 && (handValue2 > handValue || handValue > 21)){
            System.out.println("Player 2 is the winner!");
        }else{
            System.out.println("Tie!!");
        }

    }
}
