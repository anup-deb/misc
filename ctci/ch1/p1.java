
public class p1 {
    public static boolean isUnique(String s) {
        int bitVector = 0;
        for (char c : s.toCharArray()) {
            if ((bitVector & (1 << (c - 'a'))) > 0) {
                return false;
            }
            bitVector |= 1 << c - 'a';
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("abca"));
    }
}