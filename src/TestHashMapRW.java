import java.io.*;
import java.util.*;

/**
 * Created by Wolves on 07/11/2016.
 */
public class TestHashMapRW {
    public static void main(String[] args) {
        File f = new File("test.txt");
        HashMap hm = new HashMap();
        hm.put("ali","18");
        hm.put("reza","19");
        hm.put("hassan","17");
        new HashMapRWInText().saveHashMap(hm , f);
        HashMap hm2 = new HashMapRWInText().loadHashMap(f);
        System.out.println(hm2.toString());



    }
}
