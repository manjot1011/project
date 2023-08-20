/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author manjot June 2023
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
