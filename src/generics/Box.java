package generics;

/**
 * Created by Kitcatski on 11/4/2017.
 */
public class Box<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    public Box(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("U : " +u.getClass().getName());

    }
}
