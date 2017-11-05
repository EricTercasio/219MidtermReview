package factoryDesignPattern;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Dealer {
    public static void main(String[] args){
        BMWFactory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.create("BMW320"));
        System.out.println(bmwFactory.create("BMW"));
        System.out.println(bmwFactory.create("anything"));
    }
}
