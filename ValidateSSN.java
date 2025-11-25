/* 1️⃣5️⃣ Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid
 */

import java.util.regex.*;
public class ValidateSSN {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        String pattern = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println(m.group() + " is valid");
        } else {
            System.out.println("Invalid SSN!");
        }
    }
}
