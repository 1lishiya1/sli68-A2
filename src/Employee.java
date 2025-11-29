public class Employee extends Person {
    // stuff only employees have
    private String workPosition;
    private String employeeNumber;
    
    // default constructor
    public Employee() {
        super(); // call parent constructor
        this.workPosition = "Staff";
        this.employeeNumber = "EMP000";
    }
    
    // constructor with all info
    public Employee(String fullName, int yearsOld, String personalId, 
                   String workPosition, String employeeNumber) {
        super(fullName, yearsOld, personalId); // call parent constructor
        this.workPosition = workPosition;
        this.employeeNumber = employeeNumber;
    }
    
    // get methods
    public String getWorkPosition() {
        return workPosition;
    }
    
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    
    // set methods
    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}