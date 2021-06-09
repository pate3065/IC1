/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
       Card n = new Card();
       n.setValue((int)Math.floor(Math.random() * 13+1)); //c.setValue(insert call to random number generator here)
       n.setSuit(Card.SUITS[(int) (Math.random() *4)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        magicHand[i] = n;
        }
       
        //insert code to ask the user for Card value and suit, create their card

        Scanner input = new Scanner(System.in);
        Card s1 = new Card();
        System.out.println("Enter card vlaue between 1 to 13: ");
        int getValue = input.nextInt();
        s1.setValue(getValue);
        System.out.println("Enter suits - 1 for Hearts, 2 for Diamonds, 3 for Spades and 4 for Clubs");
        int getSuits = input.nextInt();
        s1.setSuit(Card.SUITS[getSuits-1]);
        
        // and search magicHand here
        
        boolean Cardmatch = true;
        for (Card magicHand1 : magicHand) {
            if (s1.getValue() == magicHand1.getValue() && s1.getSuit().equals(magicHand1.getSuit())) {
                Cardmatch = true;
                break;
            } else {
                Cardmatch = false;
            }
        }
        
        //Then report the result here
        
        if(Cardmatch)
        {
            System.out.println("You won, your card matched");
        }   
             else
        {
            System.out.println("You Lost, Better luck next time:)");
        }
    }
    
}
