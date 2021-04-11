package Unit2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Collection c = new HashSet();
        Test test = new Test();
        test.print(c);
    }

    public void print(HashSet hs) {
        System.out.println("HashSet");
    }
    
    public void print(Collection c) {
        System.out.println("Collection");
    }

    public void print(Set s) {
        System.out.println("Set");
    }
}
