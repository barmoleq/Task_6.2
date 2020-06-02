import java.util.Map;

public class MyCounter {

    public static String strOutMy = "";

    public static Map countMeeting(String text) {
        MyMap<String, Integer> myMap = new MapCustom<>();

        String[] tekst = text.split("\\.");

        for (int i = 0; i < tekst.length; i++) {
            String[] words = tekst[i].split("\\s+");
            if (i == 0) {
                for (int j = 1; j < words.length; j++) {
                        if (words[j].substring(0, 1).toUpperCase().equals(words[j].substring(0, 1))) {
                            myMap.countMeeting(words[j]);
                        }
                    }
                } else {
                for (int j = 2; j < words.length; j++) {
                        if (words[j].substring(0, 1).toUpperCase().equals(words[j].substring(0, 1))) {
                            myMap.countMeeting(words[j]);

                    }
                }
            }

        }
        return myMap.getAll();
    }
}