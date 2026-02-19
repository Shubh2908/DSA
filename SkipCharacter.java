// Skip a Character -- In this ques we have to skip a character from the original
//                     string and prints a new string after removing that character

// Ex --> up = "baccad" , p = "bccd" In this ex we skip character 'a'

package StringRecursion;

public class SkipCharacter {
    public static void main(String[] args) {
        skip("", "baccdah");

    }

    // P --> Processed String
    // UP --> Unprocessed String (The original one)
    static void skip(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if( ch == 'a'){
            skip(p, up.substring(1));
        }
        else {
            skip(p+ ch, up.substring(1));
        }

    }
}
