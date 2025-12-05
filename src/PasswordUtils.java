import java.security.SecureRandom;

public class PasswordUtils {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{};:,.<>?";
    private static final String ALL = UPPER + LOWER + DIGITS + SPECIAL;

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 8)
            throw new IllegalArgumentException("Password length must be at least 8.");

        StringBuilder password = new StringBuilder(length);

        // Ensure at least one of each
        password.append(randomChar(UPPER));
        password.append(randomChar(LOWER));
        password.append(randomChar(DIGITS));
        password.append(randomChar(SPECIAL));

        // Fill rest
        for (int i = 4; i < length; i++) {
            password.append(randomChar(ALL));
        }

        // Shuffle
        return shuffleString(password.toString());
    }

    private static char randomChar(String chars) {
        return chars.charAt(random.nextInt(chars.length()));
    }

    private static String shuffleString(String input) {
        char[] arr = input.toCharArray();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return new String(arr);
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 12) return false;

        boolean upper = false, lower = false, digit = false, special = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) lower = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }

        return upper && lower && digit && special;
    }
}
