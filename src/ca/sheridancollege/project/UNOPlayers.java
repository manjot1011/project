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
public class UNOPlayer extends Player {
    private ArrayList<UNOCard> hand;

    public UNOPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void drawCard(UNOCard card) {
        hand.add(card);
    }

    public ArrayList<UNOCard> getHand() {
        return hand;
    }

    @Override
    public void play() {

    }
}
