public interface RideInterface {
    // methods for the ride
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
    void runOneCycle();
}