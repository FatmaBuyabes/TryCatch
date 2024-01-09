import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        boolean isAttempt = false;
        int attempt = 0;

        while (!isAttempt && attempt <= 3) {
            try {
                System.out.println("Enter your username: ");
                String username = myScanner.nextLine();

                System.out.println("Enter your password: ");
                String password = myScanner.nextLine();

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    isAttempt = true;
                    System.out.println("Login Sussful");

                } else {
                    attempt++;
                    System.out.println("login again ");
                    throw new Exception(" Invalid credentials");

                }
            } catch (Exception e) {
                System.out.println("error" + e.getMessage());
            }
        }

    }

}
