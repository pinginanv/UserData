public class Worker extends User {
    private double salary;
    private int workbalance;


    public Worker(double salary, int workbalance, User user) {
        super(user.getFirstName(), user.getLastName(), user.getEmail(), user.getMobilePhone(), user.getPhone(), user.getPassword());
        this.salary = salary;
        this.workbalance = workbalance;
    }

    public void increaseSalary(){
        if (workbalance<2){
            salary = salary + salary * 0.05;
            System.out.println("increased on 5%");
        }
        if (workbalance >= 2 && workbalance <=5){
            salary = salary + salary * 0.1;
            System.out.println("increased on 10%");
        }
        if (workbalance >5){
            salary = salary + salary * 0.15;
            System.out.println("increased on 15%");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkbalance() {
        return workbalance;
    }

    public void setWorkbalance(int workbalance) {
        this.workbalance = workbalance;
    }




}
