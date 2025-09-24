package CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static javax.swing.UIManager.get;

public class CollectionDemo1 {
    public static void main(String[] args) {


        //This can accept any type of object
        /*
        Collection val = new ArrayList();
        val.add(5);
        val.add(3.5);
        val.add("7");
        val.add(6.3f);
        val.add(new String("Helloo"));
        */



        //This will accept only integer object
        /*
        Collection<Integer> val = new ArrayList<>();

        val.add(6);
        val.add(26);
        val.add(63);
        */

        //System.out.println(val);


        //Iterator<Integer> it = val.iterator();


        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());


        /*
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */


        /*
        for(Object obj:val){
            System.out.println(obj);
        }
         */

        /*
        for(Integer obj:val){
            System.out.println(obj);
        }
        */


        List<Integer> vali = new ArrayList<>();
        vali.add(6);
        vali.add(26);
        vali.add(63);
        vali.add(1,32);

        for(int i=0; i<vali.size(); i++){
            System.out.println(get(i));
        }


    }
}
