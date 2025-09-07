import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 255);
             map.put("Australia", 55);
        map.put("USA", 25);



        System.out.println(map);
        for( Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    
    }
    
}
