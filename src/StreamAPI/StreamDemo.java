package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Locale.filter;

public class StreamDemo {

    public static void main(String[] args) {
       //Printing List Method 1
        /*
        List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);

        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        */

        //Method 2 - Enhanced for loop
        /*
        List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);

        for(Integer c: list1){
            System.out.println(c);
        }
        */

        //Method 3 - For each method, obj con is an interface, and we can use lambda expression
        //Printing all element in the list one by one
        /*
        List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);

        Consumer<Integer> con = i -> System.out.println(i);
        list1.forEach(con);
        */

        //Method 4
        /*
        List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);
        list1.forEach(k-> System.out.println(k));
        */

        //Method 5 - Print all even number
        /*
        List<Integer> list1 = Arrays.asList(11,4,13,8,3,7,2);

        int sum = 0;

        for(Integer num:list1){
            if(num%2==0){
                num*=2;
                sum+=num;
            }
        }
        System.out.println(sum);
        */

        //Method 6 - Stream API
        /*
        List<Integer> list1 = Arrays.asList(11,4,13,8,3,7,2);

        Stream<Integer> s1 =  list1.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(m->m*2); //map allows us to perform operation and store it [8, 16, 4]
        int res = s3.reduce(0, (m,n)->m+n);  (8+16+4)

        System.out.println(res);
        */

        //Method 7 - shorter form of stream
        /*
        List<Integer> list1 = Arrays.asList(11,4,13,8,3,7,2);

        int val = list1.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0, (x,y)->x+y);
        System.out.println(val);
        */

        //Method 8
         /*
        List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        */

       //Method 9
       /*
       List<Integer> list1 = Arrays.asList(12,4,13,8,3,7);

       Stream<Integer> st = list1.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .sorted();
                */
    }
}