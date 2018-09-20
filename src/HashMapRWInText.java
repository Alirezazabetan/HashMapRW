import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRWInText {

    //save Hashmap in text file
    public void saveHashMap (HashMap hm, File f)
    {

        try {
            RandomAccessFile out = new RandomAccessFile(f, "rw");
            Set<Map.Entry<String,String>> e = hm.entrySet();
            for (Map.Entry<String,String> o : e) {
                out.writeBytes(o.getKey() + "=" + o.getValue()+ "\r\n");
            }
            out.close();
            System.out.println("Written Process Completed.");

        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    //Load HashMap from text file
    public HashMap loadHashMap (File f){
        HashMap hm = new HashMap();
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            while ( true ) {
                String str = raf.readLine();
                if (str != null) {
                    String[] strArray = str.split("=");
                    hm.put(strArray[0], strArray[1]);
                }else
                    break;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        return hm;
    }

}
