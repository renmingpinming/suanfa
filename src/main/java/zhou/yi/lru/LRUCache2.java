package zhou.yi.lru;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/20 17:14
 */
public class LRUCache2<K, V> {
    private final int cacheSize;
    private LinkedList<K> cacheList = new LinkedList<>();
    private HashMap<K, V> map = new HashMap<>();

    public LRUCache2(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public synchronized void put(K key, V val) {
        if (!map.containsKey(key)) {
            if (map.size() >= cacheSize) {
                removeLastElement();
            }
            cacheList.addFirst(key);
            map.put(key, val);
        } else {
            moveToFirst(key);
        }
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
        moveToFirst(key);
        return map.get(key);
    }

    private synchronized void moveToFirst(K key) {
        cacheList.remove(key);
        cacheList.addFirst(key);
    }

    private synchronized void removeLastElement() {
        K key = cacheList.removeLast();
        map.remove(key);
    }

    @Override
    public String toString() {
        return cacheList.toString();
    }

    public static void main(String[] args) {
        LRUCache2<String, String> lru = new LRUCache2<>(4);
        lru.put("C", null);
        lru.put("A", null);
        lru.put("D", null);
        lru.put("B", null);
        lru.put("E", null);
        lru.put("B", null);
        lru.put("A", null);
        lru.put("B", null);
        lru.put("C", null);
        lru.put("E", null);

        System.out.println(lru);
    }
}
