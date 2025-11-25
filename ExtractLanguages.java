/* 1️⃣2️⃣ Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
 */

import java.util.regex.*;
import java.util.*;
public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String pattern = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C|Ruby|Swift|Kotlin|PHP)\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        List<String> languages = new ArrayList<>();
        while(m.find()) {
            languages.add(m.group());
        }
        System.out.println("Extracted Languages:");
        for(String lang : languages) {
            System.out.println(lang);
        }
    }
}
