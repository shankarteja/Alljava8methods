package Streammax;

import java.util.Arrays;
import java.util.List;

public class Maxnumbermin {
    public static void main(String[] args) {

        List<Integer>Number= Arrays.asList(1,6,9,20,3,11,15,16,17,19);

        System.out.println("***********Maxium number*************");

        Integer maxnumber=Number.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(maxnumber);

        System.out.println("****** Minium Number *******************");

        Integer minnumber=Number.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(minnumber);

    }
}
