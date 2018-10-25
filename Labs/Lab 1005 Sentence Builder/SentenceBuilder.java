
/**
 * SentenceBuilder
 *
 * @author (Noel Salmeron)
 * @version (1005)
 */
public class SentenceBuilder{
    private String sentence;
    private String[] nouns = {"ball", "car", "book", "pencil", "paper"};
    private String[] verbs = {"run", "jump", "laugh", "walk", "dance"};
    private String[] adjectives = {"silly", "car", "book", "pencil", "paper"};
    private String[] adverbs;
    private String[] determiners;
    private String[] prepositions;

    public void loadSentences(String nounPhrase, String verbPhrase, String prepositionPhrase){
        String sentence = nounPhrase + verbPhrase + prepositionPhrase;
    }

    public String getSentence(){
        return sentence;
    }

    public String getNounPhrase(String determiner, String adjective){
        return determiner + adjective;
    }

    public String getPrepositionalPhrase(String preposition, String determiner, String adjective, String noun){
        return preposition + determiner + adjective + noun;
    }

    public String getVerbPhrase(String adverb, String verb){
        return adverb + verb;
    }

    public String getRandomNoun(){
        return nouns[(int)(Math.random() * 10)];
    }

    public String getRandomVerb(){
        return verbs[(int)(Math.random() * 10)];
    }

    public String getRandomAdjective(){
        return adjectives[(int)(Math.random() * 10)];
    }

    public String getRandomAdverb(){
        return adverbs[(int)(Math.random() * 10)];
    }

    public String getRandomDeterminer(){
        return determiners[(int)(Math.random() * 10)];
    }

    public String getRandomPreposition(){
        return prepositions[(int)(Math.random() * 10)];
    }

}






