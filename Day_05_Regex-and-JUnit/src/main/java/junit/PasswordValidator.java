package junit;

public class PasswordValidator {
    public static boolean isValid(String password) {
        // Regex to check:
        // - At least 8 characters
        // - At least one uppercase letter
        // - At least one digit
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        // Check if the password matches the regex
        return password != null && password.matches(regex);
    }
}