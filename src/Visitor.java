public class Visitor extends Person {
    // stuff only visitors have
    private String passType;
    private boolean isVIP;
    
    // default constructor
    public Visitor() {
        super(); // call parent constructor
        this.passType = "Standard";
        this.isVIP = false;
    }
    
    // constructor with all info
    public Visitor(String fullName, int yearsOld, String personalId, 
                  String passType, boolean isVIP) {
        super(fullName, yearsOld, personalId); // call parent constructor
        this.passType = passType;
        this.isVIP = isVIP;
    }
    
    // get methods
    public String getPassType() {
        return passType;
    }
    
    public boolean getIsVIP() {
        return isVIP;
    }
    
    // set methods
    public void setPassType(String passType) {
        this.passType = passType;
    }
    
    public void setIsVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }
}