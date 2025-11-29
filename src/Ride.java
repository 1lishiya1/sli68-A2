import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String type;
    private int capacity;
    private Employee operator;
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> riderHistory;
    private int maxRidersPerCycle;
    private int totalCyclesRun;
    // constructor
    public Ride() {
        this.rideName = "new ride";
        this.type = "general";
        this.capacity = 10;
        this.operator = null;
        this.waitingLine = new LinkedList<>();
        this.riderHistory = new LinkedList<>();
        this.maxRidersPerCycle = 4; // default
        this.totalCyclesRun = 0; // start at zero
    }
    
    // constructor with values
    public Ride(String rideName, String type, int capacity, Employee operator) {
        this.rideName = rideName;
        this.type = type;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.riderHistory = new LinkedList<>();
        this.maxRidersPerCycle = 4; // default
        this.totalCyclesRun = 0; // start at zero
    }
    public Ride(String rideName, String type, int capacity, Employee operator, int maxRiders) {
        this.rideName = rideName;
        this.type = type;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.riderHistory = new LinkedList<>();
        this.maxRidersPerCycle = maxRiders;
        this.totalCyclesRun = 0;
    }
    public String getRideName() { return rideName; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public Employee getOperator() { return operator; }
    public int getMaxRidersPerCycle() { return maxRidersPerCycle; }
    public int getTotalCyclesRun() { return totalCyclesRun; }
    public void setRideName(String rideName) { this.rideName = rideName; }
    public void setType(String type) { this.type = type; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setOperator(Employee operator) { this.operator = operator; }
    public void setMaxRidersPerCycle(int maxRiders) { this.maxRidersPerCycle = maxRiders; }
    public void setTotalCyclesRun(int cycles) { this.totalCyclesRun = cycles; }


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
    public void sortRideHistory() {
        if (riderHistory.isEmpty()) {
            System.out.println("No visitors to sort");
            return;
        }
        
        // use Collections.sort with our comparator
        Collections.sort(riderHistory, new SortVisitors());
        System.out.println("Ride history sorted by VIP and age");
    }
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
    // PART 5
    public void runOneCycle() {
        // check if operator is there
        if (operator == null) {
            System.out.println("Cant run " + rideName + " - no operator assigned");
            return;
        }
        
        // check if people are waiting
        if (waitingLine.isEmpty()) {
            System.out.println("Cant run " + rideName + " - no one in line");
            return;
        }
        
        System.out.println("=== Running " + rideName + " cycle ===");
        System.out.println("Operator: " + operator.getName());
        System.out.println("Max riders this cycle: " + maxRidersPerCycle);
        System.out.println("People in line before: " + waitingLine.size());
        
        int ridersThisTime = 0;
        
        // take people from line and add to history
        for (int i = 0; i < maxRidersPerCycle; i++) {
            if (!waitingLine.isEmpty()) {
                Visitor rider = waitingLine.remove();
                riderHistory.add(rider);
                ridersThisTime++;
                System.out.println(" - " + rider.getName() + " is riding now");
            } else {
                break; // no more people in line
            }
        }
        
        // update cycle count
        totalCyclesRun++;
        
        System.out.println("Cycle finished: " + ridersThisTime + " people rode");
        System.out.println("People in line after: " + waitingLine.size());
        System.out.println("Total cycles run: " + totalCyclesRun);
        System.out.println("Ride cycle completed successfully");
    }
}