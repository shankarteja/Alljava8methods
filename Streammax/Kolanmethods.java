package Streammax;

import java.util.Arrays;
import java.util.List;

public class Kolanmethods {

    public static void main(String[] args) {

        List<Integer>num= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer[] ar=num.toArray(num.toArray(new Integer[0]));
        System.out.println(Arrays.toString(ar));



        List<String >str=Arrays.asList("king","queen","jack","Ruby","meave");
        String[] st=str.toArray(new String[0]);
        System.out.println(Arrays.toString(st));
    }
}
