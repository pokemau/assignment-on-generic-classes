package Map;

import java.util.ArrayList;

/*
Map
Write a generic class called MyMap that accepts two generic objects --
one will act as a key and the other a value.
You are to store these objects separately in an ArrayList.
Do not use a HashMap or any Map or any built-in class that is more complicated than an ArrayList
since it defeats the purpose of this activity.

The following are its methods:
    - put(key, value)
    This adds the key and the value to their corresponding array lists at the last position.
    If the key already exists, simply change the value with the new value.
    - get(key)
    This returns the value corresponding to this key (i.e. the same index in the value's ArrayList
    as to where this is was found in the key's ArrayList). This returns null when key does not exist.
    - remove(key)
    This removes the key and value from the array, and returns the said value.
    This returns null when key does not exist.
 */
public class MyMap<K, V> {

    ArrayList<K> keys;
    ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }


    public void put(K key, V value) {
        int i = keys.indexOf(key);
        if (i >= 0) {
            values.set(i, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        int i = keys.indexOf(key);
        return i >= 0 ? values.get(i) : null;
    }

    public V remove(K key) {
        int i = keys.indexOf(key);
        if (i >= 0) {
            keys.remove(i);
            return values.remove(i);
        } else return null;
    }

    public void printMap() {
        for (int i = 0; i < values.size(); i++) {
            System.out.println(keys.get(i) + ":" + values.get(i));
        }
        System.out.println();
    }
}
