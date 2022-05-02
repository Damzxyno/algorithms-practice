import java.util.*;
import java.util.Map;
import java.util.HashMap;

// Do not edit the class below except for the insertKeyValuePair,
// getValueFromKey, and getMostRecentKey methods.
// Feel free to add new properties and methods to the class.
class Program {
    static class LRUCache {
        Map<String, Integer> content = new HashMap<>();
        List<String> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        List<Integer> usage = new ArrayList<>();
        String recentKey = "";

        int maxSize;
        int currentCount = 0;

        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }

        public void insertKeyValuePair(String key, int value) {
            // Write your code here.
            if (keys.contains(key)){
                int index = keys.indexOf(key);
                values.set(index, value);
               usage.set(index, 0);
            } else if (currentCount < maxSize){
                keys.add(key);
                values.add(value);
                usage.add(1);
                currentCount++;
            } else {
                int minimum = usage.stream().reduce(Math::min).get();
                int firstExist = usage.indexOf(minimum);
                keys.set(firstExist, key);
                values.set(firstExist, value);
                int formerVal = usage.get(firstExist);
                usage.set(firstExist, formerVal + 1);

                usage.set(firstExist,usage.get(firstExist) + 1);
            }
            recentKey = key;
        }

        public LRUResult getValueFromKey(String key) {
            // Write your code here.
            if (!keys.contains(key)) return new LRUResult(false, null);
            recentKey = key;
            int index = keys.indexOf(key);
            int formerVal = usage.get(index);
            usage.set(index, formerVal + 1);
            return new LRUResult(true, values.get(index));
        }

        public String getMostRecentKey() {
            // Write your code here.
            int index = keys.indexOf(recentKey);
            int formerVal = usage.get(index);
            usage.set(index, formerVal + 1);
            return recentKey;
        }
    }

    static class LRUResult {
        boolean found;
        Integer value;

        public LRUResult(boolean found, Integer value) {
            this.found = found;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUCache l = new LRUCache(4);
        l.insertKeyValuePair("A", 1);
        l.insertKeyValuePair("B", 2);
        l.insertKeyValuePair("C", 3);
        l.insertKeyValuePair("D", 4);
        System.out.println(l.getValueFromKey("A").value);
        l.insertKeyValuePair("E", 5);       //AECD
        System.out.println(l.getValueFromKey("A").value == 1);
        System.out.println(l.getValueFromKey("B").found);
        System.out.println(l.getValueFromKey("C").value == 3);
        System.out.println("---------");
        System.out.println(l.usage);
        System.out.println(l.keys);
        l.insertKeyValuePair("F", 5);  //AECF
        System.out.println("Kilo");
        System.out.println(l.usage);
        System.out.println(l.keys);
        System.out.println(l.getValueFromKey("C").value == 3);
        System.out.println(l.keys);
        System.out.println(l.usage);
        System.out.println(l.getValueFromKey("D").found);
//        l.insertKeyValuePair("F", 7);
//        l.insertKeyValuePair("J", 7);
        System.out.println("---------");
        System.out.println(l.keys);
        System.out.println(l.values);
        System.out.println(l.usage);
//        System.out.println(l.getMostRecentKey());
    }
}