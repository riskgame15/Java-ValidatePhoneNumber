
public class PhoneNumberValidate {
    private final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public boolean validate(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
}
