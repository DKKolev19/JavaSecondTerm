import java.util.*;
public class Main {
    public static void main(String[] args){
            Set<Integer> ints = new LinkedHashSet<>();
            ints.add(1);
            ints.add(30);
            ints.add(5);
            ints.add(2);
            ints.add(20);
            ints.remove(20);
            for (Integer integer: ints){
                System.out.println(integer);
            }
    }
}
