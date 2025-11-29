public class ThemeParkApp {
    
    public static void main(String[] args) {
        System.out.println("My Theme Park Program Starting...");
        
        // test my classes
        testMyClasses();
    }
    
    public static void testMyClasses() {
        System.out.println("=== Testing My Classes ===");
        
        // make an employee
        Employee staff1 = new Employee("Bob Johnson", 28, "ID123", "Ride Operator", "EMP456");
        System.out.println("Made employee: " + staff1.getFullName());
        
        // make a visitor
        Visitor guest1 = new Visitor("Alice Brown", 25, "VIS789", "Day Pass", true);
        System.out.println("Made visitor: " + guest1.getFullName());
        
        // make a ride with the employee
        Ride ride1 = new Ride("COASTER1", "Thrill Ride", 24, staff1);
        System.out.println("Made ride: " + ride1.getRideId());
        
        // test that employee is assigned to ride
        if (ride1.getPersonInCharge() != null) {
            System.out.println("Ride operator: " + ride1.getPersonInCharge().getFullName());
        }
        
        // test changing some values
        guest1.setPassType("Season Pass");
        System.out.println("Visitor now has: " + guest1.getPassType());
        
        // test inheritance
        System.out.println("Is employee a person? " + (staff1 instanceof Person));
        System.out.println("Is visitor a person? " + (guest1 instanceof Person));
        
        System.out.println("=== Testing Complete ===");
    }
    
    // these will be used later
    public void stepThree() {}
    public void stepFourA() {}
    public void stepFourB() {}
    public void stepFive() {}
    public void stepSix() {}
    public void stepSeven() {}
}