import java.util.*;
public class hash {
    public static void main(String[] args) {
        Hashmap<Integer,String> hm = new Hashmap<>();
        hm.put(101,"aswin");
        hm.put(102,"uk");
        hm.put(109,"uma");
        hm.put(110,"abi");
        hm.put(114,"vaitheeswaran");
        System.out.println(hm.get(114));
        System.out.println(hm.containsKey(103));
        System.out.println(hm.containsValue("abi"));

        // for map
        for(map.Entry<Integer,String> ent :hm.entryset()){
            System.out.println(ent.getKey()+ " "+ent.getvalue);

        }
         
        System.out.println("Map values");

        for(map.Entry<Integer,String> ent:hm.entryset){
            System.out.println(ent+" ");
        }



    }
}
