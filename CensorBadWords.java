/* 9️⃣ Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."
 */

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        String pattern = String.join("|", badWords);
        String censoredText = text.replaceAll("(?i)" + pattern, "****");
        System.out.println("Original: " + text);
        System.out.println("Censored: " + censoredText);
    }
}
