package dmitrii_tofan;
import java.util.ArrayList;
public class MainArrayList {
//  Lists  1.	Create an array ArrayList of strings and add some fruits inside, print array list on screen

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        for (String fruit : fruits) {
            System.out.println(fruits);
        }
    }
}
