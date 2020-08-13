public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobilePhone;
    private String phone;
    private String password;


    public User(String firstName, String lastName, String email, String mobilePhone, String phone, String password) throws Exception{
        if (isValidMail(email) && isValidPass(password)) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.mobilePhone = mobilePhone;
            this.phone = phone;
            this.password = password;
        }else throw new Exception("Invalid email or password");
    }

    public User(String email, String password) throws Exception{

        if (isValidMail(email) && isValidPass(password)){
        this.email = email;
        this.password = password;}
        else throw new Exception("invalid email or password");
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



}
