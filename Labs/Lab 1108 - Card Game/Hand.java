
/**
 * Hand
 *
 * @author (Noel Salmeron)
 * @version (1108)
 */
import java.util.ArrayList;
public class Hand{
    // ArrayList of cards that will contain five cards
    ArrayList<Card> handCards;
    
    // gets 5 cards from the deck to have in hand
    public Hand(Deck deck){
        for (int i = 0; i < 5; i++){
            deck.deck.get(i);
        }
    }

    // will return true if all the cards in the hand are of the same suit
    public boolean sameSuit(){
        boolean sameSuit = false;
        for (int i = 1; i < handCards.size(); i++){
            if (handCards.get(i).getSuit() == handCards.get(i-1).getSuit()){
                sameSuit = true;
            }
        }
        return sameSuit;
    }

    // If there is exactly one pair of cards in the hand, this method will return 
    // the rank of that card. Otherwise it will return -1.
    public int onePair(){
        if (handCards.size() == 2){
            return handCards.get(0).getRank();
        } else {
            return -1;
        }
    }
}
