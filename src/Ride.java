public class Ride implements RideInterface {  // added implements
    private String rideName;
    private String type;
    private int capacity;
    private Employee operator;
    
    // constructor
    public Ride() {
        this.rideName = "new ride";
        this.type = "general";
        this.capacity = 10;
        this.operator = null;
    }
    
    // constructor with values
    public Ride(String rideName, String type, int capacity, Employee operator) {
        this.rideName = rideName;
        this.type = type;
        this.capacity = capacity;
        this.operator = operator;
    }
    
    // get methods
    public String getRideName() {
        return rideName;
    }
    
    public String getType() {
        return type;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public Employee getOperator() {
        return operator;
    }
    
    // set methods
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void setOperator(Employee operator) {
        this.operator = operator;
    }
    
    // these methods from interface - will do later
    public void addVisitorToQueue(Visitor visitor) {
        System.out.println("adding to queue - do later");
    }
    
    public void removeVisitorFromQueue() {
        System.out.println("removing from queue - do later");
    }
    
    public void printQueue() {
        System.out.println("printing queue - do later");
    }
    
    public void addVisitorToHistory(Visitor visitor) {
        System.out.println("adding to history - do later");
    }
    
    public boolean checkVisitorFromHistory(Visitor visitor) {
        System.out.println("checking history - do later");
        return false;
    }
    
    public int numberOfVisitors() {
        System.out.println("counting visitors - do later");
        return 0;
    }
    
    public void printRideHistory() {
        System.out.println("printing history - do later");
    }
    
    public void runOneCycle() {
        System.out.println("running cycle - do later");
    }
}