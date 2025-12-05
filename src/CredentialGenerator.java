import javax.crypto.SecretKey;

public class CredentialGenerator {

    public static void main(String[] args) throws Exception {
        // 1. Generate random password
        String password = PasswordUtils.generatePassword(16);
        System.out.println("Generated password: " + password);

        // 2. Validate
        System.out.println("Is valid: " + PasswordUtils.isValidPassword(password));

        /// 3. Hash + salt
        String salt = HashUtils.generateSalt(16);
        String hash = HashUtils.hashPassword(password, salt);
        System.out.println("Salt: " + salt);
        System.out.println("Hashed password: " + hash);

        // 4. Encrypt + decrypt
        SecretKey key = EncryptionUtils.generateKey();
        byte[] iv = EncryptionUtils.generateIV();

        String encrypted = EncryptionUtils.encrypt(password, key, iv);
        String decrypted = EncryptionUtils.decrypt(encrypted, key, iv);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
