public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobilePhone;
    private String phone;
    private String password;


    protected User(String firstName, String lastName, String email, String mobilePhone, String phone, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.password = password;
    }

    private User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static boolean isValidMail(String email){
        return email.contains("@");
    }

    private static boolean isValidPass(String pass){

        return pass.length() > 7 && pass.length() < 17;
    }

    public static User createUser(String email, String password){
        if (isValidMail(email) && isValidPass(password)) return new User(email, password);

        return null;
    }

    public static User createUser(String firstName, String lastName, String email, String mobilePhone, String phone, String password){
        if (isValidMail(email) && isValidPass(password)) return new User(firstName, lastName, email, mobilePhone, phone, password);

        return null;
    }
}
