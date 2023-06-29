package dmitrii_tofan;

import java.util.HashSet;
import java.util.Set;

public class SetSize {
//  Sets  1.	Create a Set of strings and add some names to it. Print the size of the Set and check if a
//  specific name exists in the Set.

    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();

        nameSet.add("Oleg");
        nameSet.add("Marysea");
        nameSet.add("Alice");

       System.out.println("Size of the set: " + nameSet.size());

       String searchName = "Marysea";
        if (nameSet.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does not exist in the set.");
        }
    }
}
