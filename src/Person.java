// Person.java
public abstract class Person {
    // basic info for all people
    private String name;
    private int age;
    private String id;
    
    // default constructor
    public Person() {
        this.name = "unknown";
        this.age = 0;
        this.id = "000";
    }
    
    // constructor with parameters
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    // get methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getId() {
        return id;
    }
    
    // set methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setId(String id) {
        this.id = id;
    }
}