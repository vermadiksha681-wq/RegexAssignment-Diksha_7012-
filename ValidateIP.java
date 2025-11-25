/*  Advanced Problems
🔟 Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
 */

import java.util.regex.*;

public class ValidateIP {
    public static boolean isValidIP(String ip) {
        
        String num = "(25[0-5]|2[0-4]\\d|1?\\d?\\d)";
        
        String regex = "^(" + num + "\\.){3}" + num + "$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "256.10.1.5";

        System.out.println(ip1 + " → " + isValidIP(ip1));
        System.out.println(ip2 + " → " + isValidIP(ip2));
    }
}
