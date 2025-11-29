import java.util.*; // need this for Queue

public class Ride implements RideInterface {
    private String rideName;
    private String type;
    private int capacity;
    private Employee operator;
    
    // new stuff for part 3 - the waiting line
    private Queue<Visitor> waitingLine;
    
    // constructor
    public Ride() {
        this.rideName = "new ride";
        this.type = "general";
        this.capacity = 10;
        this.operator = null;
        this.waitingLine = new LinkedList<>(); // make the queue
    }
    
    // constructor with values
    public Ride(String rideName, String type, int capacity, Employee operator) {
        this.rideName = rideName;
        this.type = type;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>(); // make the queue
    }
    
    // get methods (same as before)
    public String getRideName() { return rideName; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public Employee getOperator() { return operator; }
    
    // set methods (same as before)
    public void setRideName(String rideName) { this.rideName = rideName; }
    public void setType(String type) { this.type = type; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setOperator(Employee operator) { this.operator = operator; }
    
    // PART 3: now doing the queue methods for real
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cant add null visitor");
            return;
        }
        waitingLine.add(visitor);
        System.out.println("Added " + visitor.getName() + " to line for " + rideName);
    }
    
    public void removeVisitorFromQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("Line is empty, cant remove anyone");
            return;
        }
        Visitor removed = waitingLine.remove();
        System.out.println("Removed " + removed.getName() + " from line");
    }
    
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("No one waiting for " + rideName);
            return;
        }
        
        System.out.println("People waiting for " + rideName + ":");
        int number = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(number + ". " + visitor.getName() + " (ID: " + visitor.getId() + ")");
            number++;
        }
        System.out.println("Total waiting: " + waitingLine.size());
    }
    
    // these methods still todo for later parts
    public void addVisitorToHistory(Visitor visitor) {
        System.out.println("adding to history - do in part 4");
    }
    
    public boolean checkVisitorFromHistory(Visitor visitor) {
        System.out.println("checking history - do in part 4");
        return false;
    }
    
    public int numberOfVisitors() {
        System.out.println("counting visitors - do in part 4");
        return 0;
    }
    
    public void printRideHistory() {
        System.out.println("printing history - do in part 4");
    }
    
    public void runOneCycle() {
        System.out.println("running cycle - do in part 5");
    }
}