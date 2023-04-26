import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected Set<String> set = new HashSet<>();
    public WordsChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
    }
    public boolean hasWord (String word) {
        return set.contains(word);
    }
}
