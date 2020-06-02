import java.util.Map;
import java.util.TreeMap;

public class StandartCounter {

    public static String strOutStandart = "";

    public static Map countMeeting(String text) {
        Map<String, Integer> wordToCount = new TreeMap<>();

        String[] tekst = text.split("\\.");

        for (int i = 0; i < tekst.length; i++) {
            String[] words = tekst[i].split("\\s+");
            if (i == 0) {
                for (int j = 1; j < words.length; j++) {
                        if (words[j].substring(0, 1).toUpperCase().equals(words[j].substring(0, 1))) {
                            wordToCount.put(words[j], wordToCount.getOrDefault(words[j], 0) + 1);
                        }
                }
            }else {
                for (int j = 2; j < words.length; j++) {
                    if (words[j].substring(0, 1).toUpperCase().equals(words[j].substring(0, 1))) {
                        wordToCount.put(words[j], wordToCount.getOrDefault(words[j], 0) + 1);
                    }
                }
            }
        }
        strOutStandart = String.valueOf(wordToCount);
        return wordToCount;
    }
}
