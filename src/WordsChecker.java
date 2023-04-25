import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String TEXT;
    public WordsChecker(String TEXT) {
        this.TEXT = TEXT;
    }
    public boolean hasWord (String word) {
        String[] words = TEXT.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        if (set.contains(word)) return true;
        else return false;
    }
}
