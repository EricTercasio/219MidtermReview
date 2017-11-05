package singletonDesignPattern;


/**
 * Created by Kitcatski on 11/5/2017.
 */
public class PropertiesManager {
    private static PropertiesManager singleton;

    private PropertiesManager() {
    }

    public static PropertiesManager getPropertiesManager() {
        if (singleton == null) {
            singleton = new PropertiesManager();
        }
            return singleton;
    }

}
