import java.util.Scanner;

public class Main {
    public static void main(final String ar[]) {
        String password;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль");
        password = in.next();

        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasUpperCase = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLowerCase(x)) {

                    hasLowerCase = true;
                }

                else if (Character.isDigit(x)) {

                    hasDigit = true;
                }
                
                else if (Character.isUpperCase(x)) {
                    hasUpperCase = true;
                }

                if(hasLowerCase && hasDigit && hasUpperCase){

                    break;
                    }
                }
            }
            if (hasLowerCase && hasDigit && hasUpperCase) {
                System.out.println("Надёжный");
            } 
            else {
            System.out.println("Пароль должен содержать не менее 8 символов");
        }
    }
}