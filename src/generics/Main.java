package generics;

import generics.Box;

/**
 * Created by Kitcatski on 11/4/2017.
 */
public class Main {
    public static void main(String[] args){
        Box<String, Integer> box = new Box<>("String", 123);
        System.out.println(box.getKey());
        System.out.println(box.getValue());
        box.inspect(3.12312312341234);
        box.inspect(3);
        box.inspect(4.10);



    }

}
