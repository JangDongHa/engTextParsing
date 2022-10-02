import java.util.ArrayList;
import java.util.List;

public class Input {
    private List<String> words;
    private List<String> meanings;
    public Input(){
        words = new ArrayList<>();
        meanings = new ArrayList<>();
    }

    public String inputWords(List<String> wordsAndMeanings){
        for (String wordsAndMeaning : wordsAndMeanings) {
            String word = wordsAndMeaning.split(" ")[0];
            String meaning = wordsAndMeaning.split(word + " ")[1];
            words.add("\"" + word + "\"");
            meanings.add("[\"" + meaning + "\"]");
        }

        return getResult();
    }

    public String getResult(){
        return "\"words\" : " + words + "\n" + "\"meanings\" : " + meanings;
    }

}
