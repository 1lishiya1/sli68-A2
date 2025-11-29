public class ThemeParkApp {
    
    public static void main(String[] args) {
        System.out.println("My Theme Park Program Starting...");
       
        // test my classes
        stepOne();
        stepTwo();
        stepThree();
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
    public static void stepThree(){
        System.out.println("=== Testing Part 3 ===");
        
        // make a ride
        Employee op = new Employee("Sam", 28, "E003", "ride guy", 2800.0);
        Ride myRide = new Ride("Big Coaster", "scary", 25, op);
        
        System.out.println("Made ride: " + myRide.getRideName());
        
        // make 5 visitors like assignment says
        Visitor v1 = new Visitor("Tom", 22, "V101", "day", false);
        Visitor v2 = new Visitor("Emma", 19, "V102", "vip", true);
        Visitor v3 = new Visitor("James", 35, "V103", "regular", false);
        Visitor v4 = new Visitor("Lisa", 27, "V104", "day", false);
        Visitor v5 = new Visitor("David", 31, "V105", "vip", true);
        Visitor v6 = new Visitor("Sophia", 24, "V106", "regular", false); // extra one
        
        // add them to queue
        System.out.println("\nAdding visitors to line:");
        myRide.addVisitorToQueue(v1);
        myRide.addVisitorToQueue(v2);
        myRide.addVisitorToQueue(v3);
        myRide.addVisitorToQueue(v4);
        myRide.addVisitorToQueue(v5);
        myRide.addVisitorToQueue(v6); // added 6 total
        
        // show the line
        System.out.println("\nLine before removing:");
        myRide.printQueue();
        
        // remove one visitor
        System.out.println("\nRemoving one visitor:");
        myRide.removeVisitorFromQueue();
        
        // show line again
        System.out.println("\nLine after removing:");
        myRide.printQueue();
        
        // test some problems
        System.out.println("\nTesting problems:");
        myRide.addVisitorToQueue(null); // try null visitor
        
        Ride emptyRide = new Ride("Empty", "test", 10, op);
        emptyRide.removeVisitorFromQueue(); // try empty line
        emptyRide.printQueue(); // print empty line
        
        System.out.println("Part 3 testing done");
    }
    public void stepFourA() {}
    public void stepFourB() {}
    public void stepFive() {}
    public void stepSix() {}
    public void stepSeven() {}
}