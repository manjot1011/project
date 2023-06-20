
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 *
 * @author manjot
 */

public class UnoGame extends Game {

    private GroupOfCards deck;
    private ArrayList<UnoCard> discardPile;
    private String currentColor;

    public UnoGame(String name) {
        
        
      
        super(name);
        deck = new GroupOfCards(108); // Uno deck has 108 cards
        discardPile = new ArrayList<>();
        currentColor = "";
    }

    @Override
    public void play() {
        // Implement Uno game flow here
    }

    @Override
    public void declareWinner() {
        // Implement declaring a winner in Uno here
    }
}
