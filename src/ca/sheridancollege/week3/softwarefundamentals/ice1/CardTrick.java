/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Zhao Wang
 * Student Number: 991556434
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Card.RANKS[(int)(Math.Random()*13)]);
            c.setSuit(Card.SUITS[(int)(Math.Random()*3)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please choose the suit of the card among 'Hearts', 'Diamonds', 'Spades', and 'Clubs':");
        String UserSuit = input.next();
        System.out.println("Please choose the rank of the card from 1 to 13:");
        String UserRank = input.next();
        // and search magicHand here
        //Then report the result here
    }
    
}
