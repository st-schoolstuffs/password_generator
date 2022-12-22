import java.util.Random;

class GeneratePassword {
  public static final String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String lowerChars = "abcdefghijklmnopqrstuvwxyz";
  public static final String numbers = "1234567890";
  public static final String specialChars = "!@#$%^&*()_+{}";

  public String generate(int passwordSize, boolean useUpper, boolean useLower, boolean useNumbers, boolean useSpecial) {
    char[] password = new char[passwordSize];
    String charSet = null;
    Random random = new Random();

    if (useUpper) {
      charSet += upperChars;
    }
    if (useLower) {
      charSet += lowerChars;
    }
    if (useNumbers) {
      charSet += numbers;
    }
    if (useSpecial) {
      charSet += specialChars;
    }

    for (int i = 0; i < passwordSize; i++) {
      password[i] = charSet.toCharArray()[random.nextInt(charSet.length() - 1)];
    }
    return String.valueOf(password);
  }
}

public class PasswordGenerator {
  public static void main(String[] args) {
    GeneratePassword pg = new GeneratePassword();
    System.out.println(pg.generate(10, true, true, true, true));
  }
}