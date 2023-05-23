package Streammax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Byusingnames {
    public static void main(String[] args) {
        ArrayList<String>arnames=new ArrayList<>();
        arnames.add("King");
        arnames.add("queen");
        arnames.add("Eric");
        arnames.add("meave");
        arnames.add("otic");
        arnames.add("King");
        arnames.add("queen");



        List<String>Sortnames=arnames.stream().sorted().collect(Collectors.toList());
        System.out.println(Sortnames);

        System.out.println("by using Sorting the names");
        arnames.stream().sorted().forEach(x -> System.out.println(x));





        System.out.println("Remove duplicate names");
        List<String>removeduplicatename=arnames.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(removeduplicatename);

        System.out.println("by using terminal operator ");
        arnames.stream().sorted().distinct().forEach(x-> System.out.println(x));





        System.out.println("limti names print ");
        List<String>limitvalue=arnames.stream().sorted().distinct().limit(3).collect(Collectors.toList());
        System.out.println(limitvalue);

        System.out.println("by using teminal operator limti names print");
        arnames.stream().sorted().distinct().limit(3).forEach(x-> System.out.println(x));




        System.out.println("skip value names ");
        List<String>skipnames=arnames.stream().distinct().sorted().skip(2).collect(Collectors.toList());
        System.out.println(skipnames);

        System.out.println("by using teminal operator skip  names print");
        arnames.stream().distinct().sorted().skip(2).forEach(x-> System.out.println(x));


    }
}
