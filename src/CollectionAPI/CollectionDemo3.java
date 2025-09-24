package CollectionAPI;

import java.util.*;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //Collection is a class
        /*
        List<Integer> val = new ArrayList<>();

        val.add(67);
        val.add(28);
        val.add(25);
        val.add(38);

        Collections.sort(val);
        System.out.println(val);

        for(Integer i: val){
            System.out.println(i);
        }
        */

        //SET: This does not allow duplicate, and it gives its element randomly.

        //Type 1
        //Set<Integer> set1 = new HashSet<>();

        //Type 2
        /*
        Set<Integer> set1 = new TreeSet<>();    //This will sort by default

        set1.add(23);
        set1.add(23);
        set1.add(35);
        set1.add(14);
        set1.add(38);

        System.out.println(set1);
        */

        //MAP: This is a key value pair type.
        /*
        Map<String, Integer> map = new HashMap<>();

        map.put("David", 78);
        map.put("Alex", 68);
        map.put("Anderson", 54);
        map.put("Peace", 72);
        map.ouy("David", 89); //It does not allow duplicate key
        */


        //Use one at a time
        //System.out.println(map);
        //System.out.println(map.get("Peace"));
        //System.out.println(map.get("David"));
        //System.out.println(map.keySet());

        //Usings the keys as loop
        /*
        Set<String> keys = map.keySet();

        for(String k:keys){
            System.out.println(k + " : "+ map.get(k));
        }
        */

        //STACK(LIFO - Last In First Out)
        /*
        Stack<Integer> val = new Stack<>();

        val.add(23);
        val.add(17);
        val.add(35);
        */

        //System.out.println(val);
        //System.out.println(val.peek());

        //val.push(48);
        //System.out.println(val.peek());
        //System.out.println(val);

        /*
        val.pop();
        System.out.println(val);
        System.out.println(val.peek());
        */

        //QUEUE (FIFO - First In First Out)
        Queue<Integer> val = new LinkedList<>();

        val.add(27);
        val.add(47);
        val.add(83);

        System.out.println(val);

        //val.poll();
        //System.out.println(val.peek());

        //System.out.println(val);

        //val.remove();
        //System.out.println(val);

        //val.remove(47);
        //System.out.println(val);

    }
}
