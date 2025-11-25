/* 1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
 */
import java.util.regex.*;
public class CreditCardValidator {
    public static boolean isValidCard(String card) {
        String visa = "^4\\d{15}$";
        String mastercard = "^5\\d{15}$";
        Pattern p = Pattern.compile(visa + "|" + mastercard);
        Matcher m = p.matcher(card);
        return m.matches();
    }
    public static void main(String[] args) {

        String c1 = "4123456789012345";   
        String c2 = "5123456789012345";   
        String c3 = "6123456789012345";  

        System.out.println(c1 + " → " + isValidCard(c1));
        System.out.println(c2 + " → " + isValidCard(c2));
        System.out.println(c3 + " → " + isValidCard(c3));
    }
}
