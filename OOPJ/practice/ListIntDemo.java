import java.util.*;

public class ListIntDemo {
    public static void main(String[] args) {
        /* List <String>dukkie = new LinkedList<>();
        dukkie.add("zeel's ex pet name");
        dukkie.add("no nick name of zeel anymore");
        dukkie.add(1, "kutri");
        //will add a particular value at that that particular index
        System.out.println("\n" +dukkie);

        // can also add whole another list
        List<String> newdukkie = new LinkedList<>();
        newdukkie.add("i miss you");
        newdukkie.add("i hate you");
        System.err.println(newdukkie);

        dukkie.addAll(newdukkie);
        System.out.println(dukkie);

        System.out.println(dukkie.get(4)); // to get element at particular index

        dukkie.set(3, "not anymore");//to update the value at that perticular index
        System.out.println(dukkie);
        System.out.println(dukkie.contains("love")); */

        /* dukkie.remove(index: 2) --> will remove that particular element 
         * dukkie.remove(Integer.parseInt(i miss you)) --> will remove that element with this value
        */

        //lets create another list for iterator
        List<Integer> list = new ArrayList<>();
        list.add(10);        
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
                //to iterate each element of list there are two ways 
            for(int i=0 ; i<list.size(); i++){
                System.out.println("element is : "+list.get(i));
            }
            //2nd

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator: "+it.next());
        }
    }
}
