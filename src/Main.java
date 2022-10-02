import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ClipContorller clipContorller = new ClipContorller();
        if (clipContorller.haveClip()){
            List<String> wordsAndMeanings = Arrays.stream(clipContorller.getClipboard().split("\n")).toList();
            Input input = new Input();
            String clipboard = input.inputWords(wordsAndMeanings);

            clipContorller.setClipboard(clipboard);
            clipContorller.saveClip();
        }
    }
}
