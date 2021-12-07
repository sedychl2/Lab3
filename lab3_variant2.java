import java.util.Scanner;
import java.util.regex.*;

public class lab3_variant2 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите пароль:");
        String password = scan.next();
        scan.close();

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*_)(?=.*[A-Z])(?=\\S+$).{8,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);

        if (m.find()) {
            System.out.println("Пароль соответствует всем критериям");
        } 
        else {
            System.out.println("Пароль не соответствует критериям");
        }
    }
}
