package Streammax;

import java.util.function.Supplier;

public class Suppertest {
    public static void f1(Supplier<String> fun) {
        String s1 = fun.get();
        System.out.println(s1);
    }
        public static void main(String[] args) {
             Supplier<String>sufun=()-> {
                 return "king";
             };
             f1(sufun);
    }

}
