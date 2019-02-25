package zhou.yi.lru;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {
    static final float LOAD_FACTOR = 0.75f;
    static final boolean ACCESS_ORDER = true;
    private int cacheSize;
    public LRUCache(int initialCapacity, int cacheSize) {
        super(initialCapacity, LOAD_FACTOR, ACCESS_ORDER);
        this.cacheSize = cacheSize;
    }

    @Override
    protected synchronized boolean removeEldestEntry(Map.Entry eldest) {
        return size() > cacheSize;
    }

    @Override
    public V get(Object key) {
        return super.get(key);
    }

    @Override
    public synchronized V put(K key, V value) {
        return super.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache<String, String> lru = new LRUCache<>(4, 4);
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
