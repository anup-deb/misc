import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static boolean checkPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            charCounts.put(aChar, charCounts.getOrDefault(aChar, 0) + 1);
            charCounts.put(bChar, charCounts.getOrDefault(bChar, 0) - 1);
        }

        for (int counts : charCounts.values()) {
            if (counts != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkPermutation("acvde", "cadve"));
        System.out.println(checkPermutation("a", "c"));
    }
}