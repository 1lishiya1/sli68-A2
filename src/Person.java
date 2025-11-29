public abstract class Person {
    // basic info that all people have
    private String fullName;
    private int yearsOld;
    private String personalId;
    
    // constructor with no parameters
    public Person() {
        this.fullName = "No Name";
        this.yearsOld = 0;
        this.personalId = "0000";
    }
    
    // constructor with parameters
    public Person(String fullName, int yearsOld, String personalId) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
        this.personalId = personalId;
    }
    
    // get methods
    public String getFullName() {
        return fullName;
    }
    
    public int getYearsOld() {
        return yearsOld;
    }
    
    public String getPersonalId() {
        return personalId;
    }
    
    // set methods
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    
    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }
}