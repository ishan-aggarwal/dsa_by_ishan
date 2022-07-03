package bitwise;

public class AddBinaryStrings {

    public static String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for (int i = lenA - 1, j = lenB - 1; i >= 0 || j >= 0; ) {
            if (i >= 0) {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (b.charAt(j) - '0');
                j--;
            }
            sum += carry;
            sb.append(sum % 2);
            carry = sum / 2;
            sum = 0;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "100";
        String b = "111";
        System.out.println(addBinary(a, b));
    }
}
