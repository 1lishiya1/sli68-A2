public class Employee extends Person {
    // stuff for employees
    private String position;
    private double pay;
    
    // basic constructor
    public Employee() {
        super(); // call person constructor
        this.position = "staff";
        this.pay = 0.0;
    }
    
    // constructor with all info
    public Employee(String name, int age, String id, String position, double pay) {
        super(name, age, id); // call person constructor
        this.position = position;
        this.pay = pay;
    }
    
    // get methods
    public String getPosition() {
        return position;
    }
    
    public double getPay() {
        return pay;
    }
    
    // set methods
    public void setPosition(String position) {
        this.position = position;
    }
    
    public void setPay(double pay) {
        this.pay = pay;
    }
}