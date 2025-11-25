/* 1️⃣4️⃣ Find Repeating Words in a Sentence
🔹 Example Input:
"This is is a repeated repeated word test."
🔹 Expected Output:
is, repeated
 */

import java.util.regex.*;
public class RepeatedWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        String pattern = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        System.out.println("Repeated Words:");

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
