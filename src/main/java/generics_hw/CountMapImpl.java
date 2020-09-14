package generics_hw;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T>{

    HashMap<T, Integer> tree;

    public CountMapImpl() {
        tree = new HashMap<T, Integer>();
    }

    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int count = map.getCount(5); // 2 //
        System.out.println(count);
        count = map.getCount(6); // 1 //
        System.out.println(count);
        count = map.getCount(10); // 3
        System.out.println(count);
        System.out.println("Size "+map.size());
        System.out.println(map.remove(5));
        System.out.println("Size "+map.size());
    }

    public void add(T o) {
        if (tree.containsKey(o)){
            tree.put(o,tree.get(o)+1);
        }else{
            tree.put(o,1);
        }
    }

    public int getCount(T o) {
        if (tree.containsKey(o)){
            return tree.get(o);
        }else{
            return 0;
        }
    }

    public int remove(T o) {
        if (tree.containsKey(o)){
            int res=tree.get(o);
            tree.remove(o);
            return res;
        }else{
            return 0;
        }
    }

    public int size() {
        return tree.size();
    }

    public void addAll(CountMap<T> source) {

    }

    public Map toMap() {
        return null;
    }

    public void toMap(Map destination) {

    }
}
