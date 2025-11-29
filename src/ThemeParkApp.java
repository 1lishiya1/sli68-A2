public class ThemeParkApp {
    
    public static void main(String[] args) {
        System.out.println("My Theme Park Program Starting...");
       
        // test my classes
        stepOne();
        stepTwo();
        stepThree();
        stepFourA();
        stepFourB();
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
    public static  void stepFourA() {
        System.out.println("=== Testing Part 4A ===");
        
        // make a new ride
        Employee worker = new Employee("Chris", 32, "E004", "operator", 2700.0);
        Ride waterRide = new Ride("Splash Ride", "water", 30, worker);
        
        System.out.println("Made ride: " + waterRide.getRideName());
        
        // make 5 visitors for history
        Visitor p1 = new Visitor("Anna", 25, "V201", "regular", false);
        Visitor p2 = new Visitor("Ben", 30, "V202", "vip", true);
        Visitor p3 = new Visitor("Cathy", 22, "V203", "day", false);
        Visitor p4 = new Visitor("Dan", 28, "V204", "vip", true);
        Visitor p5 = new Visitor("Eva", 35, "V205", "regular", false);
        Visitor p6 = new Visitor("Frank", 40, "V206", "season", true); // extra one
        
        // add them to history
        System.out.println("\nAdding visitors to history:");
        waterRide.addVisitorToHistory(p1);
        waterRide.addVisitorToHistory(p2);
        waterRide.addVisitorToHistory(p3);
        waterRide.addVisitorToHistory(p4);
        waterRide.addVisitorToHistory(p5);
        waterRide.addVisitorToHistory(p6); // added 6 total
        
        // check if visitor is in history
        System.out.println("\nChecking visitors in history:");
        waterRide.checkVisitorFromHistory(p3); // should be there
        waterRide.checkVisitorFromHistory(new Visitor("Unknown", 99, "X999", "test", false)); // not there
        
        // count visitors
        System.out.println("\nCounting visitors:");
        waterRide.numberOfVisitors();
        
        // print history using iterator
        System.out.println("\nPrinting ride history:");
        waterRide.printRideHistory();
        
        // test problems
        System.out.println("\nTesting problems:");
        waterRide.addVisitorToHistory(null); // try null
        waterRide.checkVisitorFromHistory(null); // try null
        
        // test empty ride
        Ride emptyRide = new Ride("Empty", "test", 10, worker);
        emptyRide.printRideHistory(); // print empty history
        emptyRide.numberOfVisitors(); // count empty
        
        System.out.println("Part 4A testing done");
    }
    public static void stepFourB() {
        System.out.println("=== Testing Part 4B ===");
        
        // make a new ride for sorting test
        Employee op = new Employee("Alex", 29, "E005", "operator", 2600.0);
        Ride coaster = new Ride("Dragon Coaster", "thrill", 20, op);
        
        System.out.println("Made ride: " + coaster.getRideName());
        
        // make visitors with different VIP and ages for testing sort
        Visitor v1 = new Visitor("Young VIP", 18, "V301", "vip", true);
        Visitor v2 = new Visitor("Old Regular", 45, "V302", "regular", false);
        Visitor v3 = new Visitor("Young Regular", 20, "V303", "regular", false);
        Visitor v4 = new Visitor("Old VIP", 40, "V304", "vip", true);
        Visitor v5 = new Visitor("Middle Regular", 30, "V305", "regular", false);
        Visitor v6 = new Visitor("Middle VIP", 35, "V306", "vip", true); // extra one
        
        // add to history in mixed order
        System.out.println("\nAdding visitors in mixed order:");
        coaster.addVisitorToHistory(v2); // old regular
        coaster.addVisitorToHistory(v1); // young VIP
        coaster.addVisitorToHistory(v4); // old VIP
        coaster.addVisitorToHistory(v3); // young regular
        coaster.addVisitorToHistory(v6); // middle VIP
        coaster.addVisitorToHistory(v5); // middle regular
        
        // show before sorting
        System.out.println("\nBefore sorting:");
        coaster.printRideHistory();
        coaster.showSortedInfo();
        
        // do the sorting
        System.out.println("\nSorting ride history...");
        coaster.sortRideHistory();
        
        // show after sorting
        System.out.println("\nAfter sorting:");
        coaster.printRideHistory();
        coaster.showSortedInfo();
        
        // test with empty ride
        System.out.println("\nTesting empty ride:");
        Ride emptyRide = new Ride("Empty", "test", 10, op);
        emptyRide.sortRideHistory();
        
        // test with only one visitor
        System.out.println("\nTesting with one visitor:");
        Ride singleRide = new Ride("Single", "test", 5, op);
        singleRide.addVisitorToHistory(new Visitor("One Person", 25, "S001", "regular", false));
        singleRide.sortRideHistory();
        singleRide.printRideHistory();
        
        System.out.println("Part 4B testing done");
    }
    public void stepFive() {}
    public void stepSix() {}
    public void stepSeven() {}
}