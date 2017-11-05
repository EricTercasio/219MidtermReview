package factoryDesignPattern;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class BMWFactory extends CarFactory {
    @Override
    public Car create(String type) {
        return "BMW320".equals(type) ? new BMW320() : new BMW();
    }
}
