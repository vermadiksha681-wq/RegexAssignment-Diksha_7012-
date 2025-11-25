/* 2️⃣ Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class LicensePlateValidator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a license plate");
        String plate = sc.nextLine();
        String regex = "^[a-z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plate);
        if(matcher.matches())
        {
            System.out.println("validlicense plate");
        }
        else 
        {
            System.out.println("not valiud");
        }

    }

}
