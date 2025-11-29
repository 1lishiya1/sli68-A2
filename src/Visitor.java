public class Visitor extends Person {
    private String ticketType;
    private boolean hasVIP;
    
    // basic constructor
    public Visitor() {
        super();
        this.ticketType = "regular";
        this.hasVIP = false;
    }
    
    // constructor with values
    public Visitor(String name, int age, String id, String ticketType, boolean hasVIP) {
        super(name, age, id);
        this.ticketType = ticketType;
        this.hasVIP = hasVIP;
    }
    
    // get methods
    public String getTicketType() {
        return ticketType;
    }
    
    public boolean getHasVIP() {
        return hasVIP;
    }
    
    // set methods
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    public void setHasVIP(boolean hasVIP) {
        this.hasVIP = hasVIP;
    }
    
    // new for part 3 - better printing
    public String toString() {
        return getName() + " - " + getAge() + " years - " + ticketType + " ticket";
    }
}