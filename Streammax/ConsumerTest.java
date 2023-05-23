package Streammax;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
    Consumer<String> Fun = x-> System.out.println(x);
    f1(Fun);

    }
    public static void f1(Consumer<String> dumyFun){
        dumyFun.accept("King");

    }

}


