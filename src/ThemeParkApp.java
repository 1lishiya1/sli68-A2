public class ThemeParkApp {
    
    public static void main(String[] args) {
        System.out.println("My Theme Park Program Starting...");
        
        // test my classes
        stepOne();
        stepTwo();
    }
    
    public static void stepOne() {
        System.out.println("Testing part 1");
        
        Employee emp1 = new Employee("John", 25, "E001", "operator", 3000.0);
        Visitor vis1 = new Visitor("Alice", 20, "V001", "day pass", true);
        Ride ride1 = new Ride("coaster", "fast", 20, emp1);
        
        System.out.println("Made: " + emp1.getName() + ", " + vis1.getName() + ", " + ride1.getRideName());
    }
        // new method for part 2
    public static void stepTwo() {
        System.out.println("Testing part 2");
        
        Employee emp2 = new Employee("Mike", 30, "E002", "worker", 2500.0);
        Ride ride2 = new Ride("wheel", "slow", 15, emp2);
        
        // check if ride uses the interface
        boolean usesInterface = ride2 instanceof RideInterface;
        System.out.println("Ride uses interface: " + usesInterface);
        
        // try the interface methods
        Visitor testVisitor = new Visitor("test", 18, "T001", "test", false);
        ride2.addVisitorToQueue(testVisitor);
        ride2.printQueue();
        
        System.out.println("Part 2 test done");
    }
    // these will be used later
    public void stepThree() {}
    public void stepFourA() {}
    public void stepFourB() {}
    public void stepFive() {}
    public void stepSix() {}
    public void stepSeven() {}
}