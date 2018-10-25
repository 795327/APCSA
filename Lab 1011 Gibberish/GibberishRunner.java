
/**
 * GibberishRunner 
 *
 * @author (Noel Salmeron)
 * @version (1011)
 */
public class GibberishRunner{
    public static void main(){
        //makes word list object
        WordList5000 wordList5000 = new WordList5000();
        
        // creates gibberish object
        Gibberish gibberish = new Gibberish();
        
        //calls makeGibberish method and prints out the gibberish returned
        System.out.println(gibberish.makeGibberish(wordList5000));
    }
}
