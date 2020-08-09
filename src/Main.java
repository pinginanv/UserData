public class Main {
    public static void main(String[] args) {

        System.out.println("1. Creating Proper Users");
        System.out.println("===================================");
        String validEmail = "test@mail.com";
        String validPassword = "1239qtwu3456";

        User validuser1 = User.createUser(validEmail,validPassword);
        if (validuser1!=null) System.out.println("User created: email: " + validuser1.getEmail() + ", password: " + validuser1.getPassword());
        else System.out.println("Validation of email or password failed");

        User validuser2 = User.createUser("Petya", "Petechkin", validEmail,"0675000000", "12345" ,validPassword);
        if (validuser1!=null) System.out.println("User created: " + validuser2.getFirstName() + " " + validuser2.getLastName() + " email: " + validuser1.getEmail() + ", password: " + validuser1.getPassword());
        else System.out.println("Validation of email or password failed");

        System.out.println("2. Creating User with invalid mail");
        System.out.println("===================================");
        String inValidEmail = "testmail.com";


        User invalidvaliduser1 = User.createUser(inValidEmail,validPassword);
        if (invalidvaliduser1!=null) System.out.println("User created: email: " + invalidvaliduser1.getEmail() + ", password: " + invalidvaliduser1.getPassword());
        else System.out.println("Validation of email or password failed");

        System.out.println("3. Creating User with invalid pass");
        System.out.println("===================================");

        String inValidPassword = "12345678";

        User invalidvaliduser2 = User.createUser(validEmail,inValidPassword);
        if (invalidvaliduser1!=null) System.out.println("User created: email: " + invalidvaliduser2.getEmail() + ", password: " + invalidvaliduser2.getPassword());
        else System.out.println("Validation of email or password failed");


        System.out.println("4. Creating Worker with salary manipulations");
        System.out.println("===================================");

        Worker worker = new Worker(1000, 1, validuser2);
        System.out.println("Worker created: " + worker.getFirstName() + " " + worker.getLastName() + ": salary: " + worker.getSalary() + " current work balance: " + worker.getWorkbalance());
        worker.increaseSalary();

        System.out.println("New Salary: " + worker.getSalary());

        worker.setWorkbalance(2);
        System.out.println("New work balance: " + worker.getWorkbalance());
        worker.increaseSalary();
        System.out.println("New Salary: " + worker.getSalary());

        worker.setWorkbalance(3);
        System.out.println("New work balance: " + worker.getWorkbalance());
        worker.increaseSalary();
        System.out.println("New Salary: " + worker.getSalary());

        worker.setWorkbalance(4);
        System.out.println("New work balance: " + worker.getWorkbalance());
        worker.increaseSalary();
        System.out.println("New Salary: " + worker.getSalary());

        worker.setWorkbalance(5);
        System.out.println("New work balance: " + worker.getWorkbalance());
        worker.increaseSalary();
        System.out.println("New Salary: " + worker.getSalary());

        worker.setWorkbalance(6);
        System.out.println("New work balance: " + worker.getWorkbalance());
        worker.increaseSalary();
        System.out.println("New Salary: " + worker.getSalary());

    }
}
