
/**
 * Card
 *
 * @author (Noel Salmeron)
 * @version (1108)
 */
public class Card{
    int rank;
    String suit;
    
    // Card constructor
    public Card(int rank, String suit){
        rank = 0;
        suit = "";
    }
    
    // returns a Card object's rank
    public int getRank(){
        return rank;
    }
    
    // returns a Card object's suit
    public String getSuit(){
        return suit;
    }
}
