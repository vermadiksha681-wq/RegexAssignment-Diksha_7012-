/* 1️⃣3️⃣ Extract Currency Values from a Text
🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50
 */
import java.util.regex.*;
import java.util.*;

public class CurrencyExtractor {
    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        String pattern = "\\$?\\d+\\.\\d{2}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        System.out.println("Extracted Currency Values:");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

