package CoreJavaPractice;

import java.util.Arrays;

public class InstantJazz {
    public static String[]  jazzify(String[] arr) {
        String [] addedSeven = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            addedSeven[i] = arr[i];
            if(addedSeven[i].contains("7")){
//                addedSeven
            }
        }

        return addedSeven;
    }

    public static void main(String[] args) {
        String [] arr = {"Dm", "G7", "E", "A"};
        System.out.println(Arrays.toString(jazzify(arr)));
    }
}
