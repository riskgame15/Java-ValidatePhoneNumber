
public class PhoneNumberTest {
    public static String[] validNumbers = {"(84)-(0978489648)", "(01)-(0123456789)"};
    public static String[] invalidNumbers = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumberValidate validator = new PhoneNumberValidate();
        for (String number : validNumbers) {
            boolean isValid = validator.validate(number);
            System.out.println("Number " + number + " is valid? " + isValid);
        }
        System.out.println();
        for (String number : invalidNumbers) {
            boolean isValid = validator.validate(number);
            System.out.println("Number " + number + " is valid? " + isValid);
        }
    }
}
