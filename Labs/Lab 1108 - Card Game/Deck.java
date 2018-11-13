
/**
 * Deck
 *
 * @author (Noel Salmeron)
 * @version (1108)
 */
import java.util.ArrayList;
public class Deck{
    ArrayList<Card> deck;

    // adds the 52 cards included in a normal deck to the deck ArrayList
    public Deck(){
        for (int i = 1; i < 14; i++){
            for (int a = 0; a < 4; a++){
                if (a == 0){
                    Card card = new Card(i, "Heart");
                    deck.add(card);
                }
                if (a == 1){
                    Card card = new Card(i, "Diamond");
                    deck.add(card);
                }
                if (a == 2){
                    Card card = new Card(i, "Spade");
                    deck.add(card);
                }
                if (a == 3){
                    Card card = new Card(i, "Club");
                    deck.add(card);
                }
            }
        }
    }

    // will return a Card object from the deck ArrayList
    public Card getCard(int x){
        return deck.get(x);
    }
}
