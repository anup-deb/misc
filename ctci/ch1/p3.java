public class p3 {
    public static void urlify(char[] a, int length) {
        int numSpaces = 0;
        for (int i = 0; i < length; i++) {
            if (a[i] == ' ') {
                numSpaces++;
            }
        }
        int finalIndex = length + numSpaces * 2;

        for (int i = length - 1; i>= 0; i--) {
            if (a[i] == ' ') {
                a[finalIndex] = '0';
                a[finalIndex-1] = '2';
                a[finalIndex-2] = '%';
                finalIndex -= 3;
            } else {
                a[finalIndex] = a[i];
                finalIndex--;
            }
        }
    }



    public static void main(String[] args) {
        String str = "Mr John Smith       "; 
        char[] a = str.toCharArray();
        urlify(a, 13);
        System.out.println(a);
    }
}