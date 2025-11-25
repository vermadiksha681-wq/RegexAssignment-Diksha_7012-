/* 3️⃣ Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HexColorValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hex Color Code: ");
        String color = sc.nextLine();
        String regex = "^#[A-Fa-f0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(color);
        if (matcher.matches()) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }
    }
}

