/**
 * The Class Keyword create the words that are used in the logic puzzle
 * it contains the relationships of itself and other words
 *
 * Created by catherinehuang on 2/12/15.
 */
public class Keyword {

    private static String word;
    private String[] relationship;

    /**
     * Constructor of Keyword
     */
    public Keyword(String a, String[] relate) {
        this.word = a;
        this.relationship = relate;
    }

    public static String getWord() {
        return word;
    }

    public static void setWord(String word) {
        Keyword.word = word;
    }

    public String[] getRelationship() {
        return relationship;
    }

    public void setRelationship(String[] relationship) {
        this.relationship = relationship;
    }
}

