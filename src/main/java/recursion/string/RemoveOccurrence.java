package recursion.string;

public class RemoveOccurrence {
    public static void main(String[] args) {
        String input = "abcaaccdea";
        String output = removeChar(input, "");
        System.out.println(output);
    }

    private static String removeChar(String ip, String op) {
        if (ip == null || ip.isEmpty()) {
            return op;
        }
        char ch = ip.charAt(0);
        if (ch != 'a') {
            return removeChar(ip.substring(1), op + ch);
        }
        return removeChar(ip.substring(1), op);
    }
}
