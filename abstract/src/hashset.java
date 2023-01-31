import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hashset {
    public static void main (String args[]){
        Set <String> names = new HashSet<>() ;
        HashSet <String> myString = new HashSet<>();
        myString.add("abebe");
        myString.add("ephrem");
        Map<String, HashSet<String>> name = new HashMap<>();
        name.put("tsion",myString);
        System.out.println(name);
    }
}
