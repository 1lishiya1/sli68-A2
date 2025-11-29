public class ThemeParkApp {
    
    public static void main(String[] args) {
        System.out.println("My Theme Park Program Starting...");
       
        // test my classes
        stepOne();
        stepTwo();
        stepThree();
        stepFourA();
        stepFourB();
        stepFive();
        stepSix();
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
        Employee op = new Employee("Chen", 28, "E003", "ride guy", 2800.0);
        Ride myRide = new Ride("Big Coaster", "scary", 25, op);
        
        System.out.println("Made ride: " + myRide.getRideName());
        
        // make 5 visitors like assignment says
        Visitor v1 = new Visitor("Mike", 22, "V101", "day", false);
        Visitor v2 = new Visitor("Emma", 19, "V102", "vip", true);
        Visitor v3 = new Visitor("James", 35, "V103", "regular", false);
        Visitor v4 = new Visitor("Louis", 27, "V104", "day", false);
        Visitor v5 = new Visitor("Danny", 31, "V105", "vip", true);
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
    public static void stepFive() {
        System.out.println("=== Testing Part 5 ===");
        
        // make a ride with max riders = 3
        Employee operator = new Employee("Cycle Master", 26, "E006", "operator", 2900.0);
        Ride rollerCoaster = new Ride("Lightning Coaster", "thrill", 15, operator, 3);
        
        System.out.println("Made ride: " + rollerCoaster.getRideName());
        System.out.println("Max riders per cycle: " + rollerCoaster.getMaxRidersPerCycle());
        
        // make 10 visitors like assignment says
        System.out.println("\nAdding 10 visitors to line:");
        for (int i = 1; i <= 10; i++) {
            Visitor visitor = new Visitor("Person" + i, 20 + i, "V" + (400 + i), "regular", i % 3 == 0);
            rollerCoaster.addVisitorToQueue(visitor);
        }
        
        // show line before running
        System.out.println("\nLine before running cycle:");
        rollerCoaster.printQueue();
        
        // run one cycle
        System.out.println("\nRunning one cycle:");
        rollerCoaster.runOneCycle();
        
        // show line after running
        System.out.println("\nLine after running cycle:");
        rollerCoaster.printQueue();
        
        // show history
        System.out.println("\nRide history after cycle:");
        rollerCoaster.printRideHistory();
        
        // test problems
        System.out.println("\nTesting problems:");
        
        // test ride with no operator
        Ride noOpRide = new Ride("Broken Ride", "test", 10, null, 2);
        noOpRide.addVisitorToQueue(new Visitor("Test", 20, "T001", "test", false));
        noOpRide.runOneCycle();
        
        // test ride with empty line
        Ride emptyRide = new Ride("Empty Ride", "test", 5, operator, 2);
        emptyRide.runOneCycle();
        
        // run another cycle on our ride
        System.out.println("\nRunning second cycle:");
        rollerCoaster.runOneCycle();
        System.out.println("Total cycles run now: " + rollerCoaster.getTotalCyclesRun());
        
        // show everything after second cycle
        System.out.println("\nFinal line after second cycle:");
        rollerCoaster.printQueue();
        System.out.println("\nFinal history after second cycle:");
        rollerCoaster.printRideHistory();
        
        System.out.println("Part 5 testing done");
    }
    public static  void stepSix() {
        System.out.println("=== Testing Part 6 ===");
        
        // make a new ride for file testing
        Employee fileOp = new Employee("File Guy", 35, "E007", "operator", 3000.0);
        Ride fileRide = new Ride("xiaomi su7", "xiaomi su7", 20, fileOp);
        
        System.out.println("Made ride: " + fileRide.getRideName());
        
        // make and add at least 5 visitors to history
        System.out.println("\nAdding visitors to history:");
        Visitor p1 = new Visitor("Ukiveil File", 25, "F001", "day pass", false);
        Visitor p2 = new Visitor("Uniapp File", 30, "F002", "vip", true);
        Visitor p3 = new Visitor("Mike File", 22, "F003", "regular", false);
        Visitor p4 = new Visitor("Sarah File", 28, "F004", "vip", true);
        Visitor p5 = new Visitor("Mike File", 35, "F005", "season", false);
        Visitor p6 = new Visitor("Louis File", 19, "F006", "regular", true); // extra one
        
        fileRide.addVisitorToHistory(p1);
        fileRide.addVisitorToHistory(p2);
        fileRide.addVisitorToHistory(p3);
        fileRide.addVisitorToHistory(p4);
        fileRide.addVisitorToHistory(p5);
        fileRide.addVisitorToHistory(p6); // added 6 total
        
        // show history before export
        System.out.println("\nHistory before export:");
        fileRide.printRideHistory();
        
        // export to file with auto name
        System.out.println("\nExporting to file with auto name:");
        fileRide.exportRideHistory();
        
        // export to file with custom name
        System.out.println("\nExporting to file with custom name:");
        fileRide.exportRideHistory("my_ride_data.csv");
        
        // test with empty history
        System.out.println("\nTesting empty history:");
        Ride emptyRide = new Ride("Empty Ride", "test", 10, fileOp);
        emptyRide.exportRideHistory();
        
        System.out.println("\nPart 6 done - check project folder for .txt and .csv files");
    }
    public void stepSeven() {}
}