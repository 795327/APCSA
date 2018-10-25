
/**
 * Gibberish
 *
 * @author (Noel Salmeron)
 * @version (1011)
 */
public class Gibberish{
    //declares a new string, sourceString
    String sourceString;

    //constructor for Gibberish class
    public Gibberish(){
        //makes a Template object
        Template template = new Template();

        //initializes the source string with a template
        sourceString = template.getSourceString();
    }

    //method that forms gibberish to return
    public String makeGibberish(WordList5000 wordlist5000){
        //declaration and initialization of variables in order to create gibberish 
        //and keep track of necessary values
        int currentSourceIndex = 0;
        String resultString = new String();

        //infinite loop that goes through the entire source string
        while (currentSourceIndex < sourceString.length()){
            //checks for a bracket to see if more can be added to the result string
            if (sourceString.indexOf("<", currentSourceIndex) == -1){
                //appends the rest of the source string to the result string
                resultString += sourceString.substring(currentSourceIndex);
                currentSourceIndex = sourceString.length();
            } else {
                //finds the part of speech
                String placeHolderString = sourceString.substring((sourceString.indexOf("<", currentSourceIndex)), (sourceString.indexOf(">", currentSourceIndex)));
                //checks if the placeholder string is actually a string and not a non-value
                if (wordlist5000.getRandomWordString(placeHolderString) != null){
                    //adds the previous part of the source string and a random word to the result string
                    resultString += (sourceString.substring(currentSourceIndex, (sourceString.indexOf("<", currentSourceIndex))) + wordlist5000.getRandomWordString(placeHolderString));
                }
                //moves the index to the beginning of the next string
                currentSourceIndex = sourceString.indexOf("</>", currentSourceIndex) + 3;
            }
        }
        //returns the gibberish that was put together
        return resultString;
    }
}












