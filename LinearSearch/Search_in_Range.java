package LinearSearch;

public class Search_in_Range {

    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16,45,67,98};
        int target = 12;
        System.out.println(linearSearch(arr , target ,1,4));

    }

    static int linearSearch(int[] arr , int target ,int start , int end ){
        if(arr.length == 0){
            return-1;
        }

        for(int index = start; index<=end ; index ++){
            int element = arr[index];
            if (target==element){
                return index;
            }

        }

        return -1;

    }
}
