/* 
📝 Basic Regex Problems
1️⃣ Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}
