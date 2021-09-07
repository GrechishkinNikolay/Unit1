package unit5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterJavaWords {

    private static List<String> javaKeyWords = new ArrayList<>(Arrays.asList("package", "public", "class", "private", "String", "this", "void", "static", "abstract", "import", "return"));

    public static Map<String, Integer> countJavaWordsMap(String javaCode) {

        List<String> javaCodeWords = Arrays.asList(javaCode.split("[^a-zA-Z]+"));

        Map<String, Integer> map = new HashMap<>();

        javaCodeWords
            .stream()
            .filter(javaKeyWords::contains)
            .forEach(keyWord -> {
                if (map.containsKey(keyWord)) {
                    map.put(keyWord, map.get(keyWord) + 1);
                } else {
                    map.put(keyWord, 1);
                }
            });

        return map;
    }
}
