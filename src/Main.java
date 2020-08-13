public class Main {
    public static void main(String[] args) {

        System.out.println("1. Creating Proper Users");
        System.out.println("===================================");
        String validEmail = "test@mail.com";
        String validPassword = "1239qtwu3456";
        String inValidEmail = "testmail.com";
        String inValidPassword = "12345";
        User validuser1;
        User validuser2;

        try {
            validuser1 = new User(validEmail, validPassword);
           System.out.println("User created: email: " + validuser1.getEmail() + ", password: " + validuser1.getPassword());


            validuser2 = new User("Petya", "Petechkin", validEmail,"0675000000", "12345" ,validPassword);
            System.out.println("User created: " + validuser2.getFirstName() + " " + validuser2.getLastName() + " email: " + validuser1.getEmail() + ", password: " + validuser1.getPassword());



        }catch (Exception e){
            System.out.println("Cant create user: " + e.getMessage());
        }



try{
    System.out.println("2. Creating User with invalid mail");
    System.out.println("===================================");


    User invalidvaliduser1 = new User(inValidEmail,validPassword);
    if (invalidvaliduser1!=null) System.out.println("User created: email: " + invalidvaliduser1.getEmail() + ", password: " + invalidvaliduser1.getPassword());
    else System.out.println("Validation of email or password failed");

}catch (Exception e){
    System.out.println("Cant create user: " + e.getMessage());
}

        try{
            System.out.println("3. Creating User with invalid pass");
            System.out.println("===================================");



            User invalidvaliduser2 = new User(validEmail,inValidPassword);
            System.out.println("User created: email: " + invalidvaliduser2.getEmail() + ", password: " + invalidvaliduser2.getPassword());



        }catch (Exception e){
            System.out.println("Cant create user: " + e.getMessage());
        }




try {

    System.out.println("4. Creating User and Worker with salary manipulations");
    System.out.println("===================================");
    validuser2 = new User("Petya", "Petechkin", validEmail, "0675000000", "12345", validPassword);
    System.out.println("User created: " + validuser2.getFirstName() + " " + validuser2.getLastName() + " email: " + validuser2.getEmail() + ", password: " + validuser2.getPassword());



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
}catch (Exception e){
    System.out.println("Cant create user: " + e.getMessage());
}
    }
}
