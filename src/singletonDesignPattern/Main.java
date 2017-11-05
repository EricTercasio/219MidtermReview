package singletonDesignPattern;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Main {
    public static void main(String[] args){
        PropertiesManager pm = PropertiesManager.getPropertiesManager();
        System.out.println(pm);
        PropertiesManager pm2 = PropertiesManager.getPropertiesManager();
        System.out.println(pm2);
    }
}
