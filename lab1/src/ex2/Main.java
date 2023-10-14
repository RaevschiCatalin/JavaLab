package ex2;

public class Main {
    public static void main(String[] args) {
        String s = args[0];
        System.out.println(removeConsecutiveDuplicates(s));
    }

    public static String removeConsecutiveDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (i == 0 || c != s.charAt(i - 1)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

