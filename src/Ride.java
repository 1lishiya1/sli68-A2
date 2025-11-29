public class Ride {
    // info about the ride
    private String rideId;
    private String rideCategory;
    private int maxPeople;
    private Employee personInCharge;
    
    // default constructor
    public Ride() {
        this.rideId = "RIDE001";
        this.rideCategory = "Family";
        this.maxPeople = 12;
        this.personInCharge = null; // no one assigned yet
    }
    
    // constructor with parameters
    public Ride(String rideId, String rideCategory, int maxPeople, Employee personInCharge) {
        this.rideId = rideId;
        this.rideCategory = rideCategory;
        this.maxPeople = maxPeople;
        this.personInCharge = personInCharge;
    }
    
    // get methods
    public String getRideId() {
        return rideId;
    }
    
    public String getRideCategory() {
        return rideCategory;
    }
    
    public int getMaxPeople() {
        return maxPeople;
    }
    
    public Employee getPersonInCharge() {
        return personInCharge;
    }
    
    // set methods
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }
    
    public void setRideCategory(String rideCategory) {
        this.rideCategory = rideCategory;
    }
    
    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }
    
    public void setPersonInCharge(Employee personInCharge) {
        this.personInCharge = personInCharge;
    }
}