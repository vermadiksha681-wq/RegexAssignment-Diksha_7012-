/* 🔄 Replace and Modify Strings
8️⃣ Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
 */

public class ReplaceSpaces {
    public static void main(String[] args) {

        String text = "This   is   an    example   with    multiple    spaces.";
        String result = text.replaceAll("\\s+", " ");

        System.out.println("Original: " + text);
        System.out.println("Modified: " + result);
    }
}
