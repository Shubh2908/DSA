package StringRecursion;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
      //  pad("", "12");
        System.out.println(padRet("", "12"));

    }
    // Approach 1
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
      int digit = up.charAt(0) - '0'; // It converts a digit character (like '1', '2', '5')
                                      // into its actual integer value (1, 2, 5).

        for (int i = (digit-1)*3; i < digit*3 ; i++) {

            char ch = (char) ('a' + i);

            pad(p+ch, up.substring(1));
            
        }
    }

    // Approach 2
    static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch, up.substring(1)));

        }
        return list;
    }
}
