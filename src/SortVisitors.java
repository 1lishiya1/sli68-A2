import java.util.Comparator;

public class SortVisitors implements Comparator<Visitor> {
    
    public int compare(Visitor v1, Visitor v2) {
        // first check VIP - VIP people go first
        boolean v1VIP = v1.getHasVIP();
        boolean v2VIP = v2.getHasVIP();
        
        if (v1VIP && !v2VIP) {
            return -1; // v1 is VIP, v2 is not - v1 comes first
        }
        if (!v1VIP && v2VIP) {
            return 1; // v2 is VIP, v1 is not - v2 comes first
        }
        
        // if both same VIP status, then sort by age - younger first
        int age1 = v1.getAge();
        int age2 = v2.getAge();
        
        if (age1 != age2) {
            return Integer.compare(age1, age2);
        }
        
        // if same age too, then sort by name
        return v1.getName().compareTo(v2.getName());
    }
}