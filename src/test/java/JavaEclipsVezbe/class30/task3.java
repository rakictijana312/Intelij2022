package class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {

        List<Integer> numbers=new LinkedList<>();

        for (int i = 1; i <= 50; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
