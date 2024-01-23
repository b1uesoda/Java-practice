import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionsEx {
    public static void displayPoints(HashMap<String, Integer> hm) {
        Set<String> key = hm.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.print("(" + str + "," + hm.get(str) + ")");
        }
        System.out.println();
    }
}
