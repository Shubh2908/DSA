package StringRecursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        //subseq("", "abc");
        System.out.println(subseqRet("", "abc"));

    }

    // Approach 1
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); //Initially Taking First Character

        // Two choices for each character:Take it, ignore it

        subseq(p + ch, up.substring(1)); // Take it
        subseq(p, up.substring(1)); // Ignore it
    }

    // Approach 2
    static ArrayList<String> subseqRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);  // Combines both left and right subtree
        return left;
    }
}
