import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String type;
    private int capacity;
    private Employee operator;
    
    // part 3 stuff
    private Queue<Visitor> waitingLine;
    
    // new for part 4A - history of riders
    private LinkedList<Visitor> riderHistory;
    
    // constructor
    public Ride() {
        this.rideName = "new ride";
        this.type = "general";
        this.capacity = 10;
        this.operator = null;
        this.waitingLine = new LinkedList<>();
        this.riderHistory = new LinkedList<>(); // new list for history
    }
    
    // constructor with values
    public Ride(String rideName, String type, int capacity, Employee operator) {
        this.rideName = rideName;
        this.type = type;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.riderHistory = new LinkedList<>(); // new list for history
    }
    
    // get methods (same)
    public String getRideName() { return rideName; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public Employee getOperator() { return operator; }
    
    // set methods (same)
    public void setRideName(String rideName) { this.rideName = rideName; }
    public void setType(String type) { this.type = type; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setOperator(Employee operator) { this.operator = operator; }
    
    // PART 3 methods (same)
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
    
    // PART 4A: now doing the history methods for real
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cant add null visitor to history");
            return;
        }
        riderHistory.add(visitor);
        System.out.println("Added " + visitor.getName() + " to ride history");
    }
    
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cant check null visitor");
            return false;
        }
        
        boolean found = riderHistory.contains(visitor);
        if (found) {
            System.out.println(visitor.getName() + " is in ride history");
        } else {
            System.out.println(visitor.getName() + " is NOT in ride history");
        }
        return found;
    }
    
    public int numberOfVisitors() {
        int count = riderHistory.size();
        System.out.println("There are " + count + " visitors in ride history");
        return count;
    }
    
    public void printRideHistory() {
        if (riderHistory.isEmpty()) {
            System.out.println("No visitors in ride history for " + rideName);
            return;
        }
        
        System.out.println("Ride history for " + rideName + ":");
        // using iterator like assignment says
        Iterator<Visitor> it = riderHistory.iterator();
        int count = 1;
        while (it.hasNext()) {
            Visitor visitor = it.next();
            System.out.println(count + ". " + visitor.toString());
            count++;
        }
        System.out.println("Total in history: " + riderHistory.size());
    }
    // PART 4B: new method to sort the history
    public void sortRideHistory() {
        if (riderHistory.isEmpty()) {
            System.out.println("No visitors to sort");
            return;
        }
        
        // use Collections.sort with our comparator
        Collections.sort(riderHistory, new SortVisitors());
        System.out.println("Ride history sorted by VIP and age");
    }
    // helper method to see if sorting worked
    public void showSortedInfo() {
        if (riderHistory.isEmpty()) {
            System.out.println("No visitors in history");
            return;
        }
        
        System.out.println("First few visitors after sorting:");
        int count = 0;
        for (Visitor visitor : riderHistory) {
            if (count >= 3) break; // only show first 3
            String vipStatus = visitor.getHasVIP() ? "VIP" : "Regular";
            System.out.println(" - " + visitor.getName() + " (" + visitor.getAge() + " years, " + vipStatus + ")");
            count++;
        }
    }
    // still todo for later parts
    public void runOneCycle() {
        System.out.println("running cycle - do in part 5");
    }
}