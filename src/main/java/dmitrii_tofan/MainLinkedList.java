package dmitrii_tofan;

import java.util.Collections;
import java.util.LinkedList;

public class MainLinkedList {
//    2.	Create array LinkedList of integers and add some numbers, sort this list and print its sorted content

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(5);
        num.add(2);
        num.add(8);
        num.add(1);
        num.add(10);

        Collections.sort(num);

        for (Integer number : num){
            System.out.println(number);
        }


    }
}
