package Strings;

public class StringBasics {

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static double shortestPath(String str) {
        double x = 0;
        double y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        double sum = (x * x) + (y * y);
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        // System.out.println(checkPalindrome(str));
        System.out.println(shortestPath(str));
    }
}
