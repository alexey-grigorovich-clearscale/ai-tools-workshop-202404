import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleCTFChallenge {
    private final String username = "admin";
    private final String encryptionKey     = "MyEncryptionKey!1";
    private final String encryptedPassword = "\000\000d=\006\021\013C\0009\016\0358\022\026SU";
    private final String flag = "flag{S1mpl3CTFCh@ll3ng3}";

    public String getFlag(String username, String password) {
        // decrypt the password in `encryptedPassword` using XOR with a key stored in `encryptionKey`. Note that the key has to be the same length as the encrypted password:
        var decryptedPassword = new StringBuilder();
        for (int i = 0; i < encryptedPassword.length(); i++) {
            decryptedPassword.append((char) (encryptedPassword.charAt(i) ^ encryptionKey.charAt(i % encryptionKey.length())));
        }

        System.out.println("decrypted password: " + decryptedPassword.toString());
        if (this.username.equals(username) && decryptedPassword.toString().equals(password)) {
            return flag;
        } else {
            return "Invalid credentials";
        }
    }

    public static void main(String[] args) throws Exception {
        var r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Username: ");
        var username = r.readLine();
        System.out.print("Password: ");
        var password = r.readLine();

        SimpleCTFChallenge ctf = new SimpleCTFChallenge();
        System.out.println(ctf.getFlag(username, password));
    }
}
