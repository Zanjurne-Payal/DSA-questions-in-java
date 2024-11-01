package HashMap;
import java.util.*;
public class implementation {
    static class MYHashMap<k,v> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int n) {
            buckets = new LinkedList[n];
            for (int i = 0; i < buckets.length; i++)
            {
                buckets[i] = new LinkedList<>();
            }
        }
        private int Hash(k key)
        {
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }
        private int search(LinkedList<Node> ll,k key)
        {
            for(int i = 0 ; i < ll.size() ; i++)
            {
                if(ll.get(i).key == key)
                {
                    return i;
                }
            }
            return -1;
        }
        public MYHashMap()
        {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size()
        {
         return n;
        }

        public void put(k key , v value)
        {
            int bi = Hash(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = search(currentBucket , key);
            if(ei == -1)
            {
                Node node = new Node(key , value);
                currentBucket.add(node);
                n++;
            }
            else
            {
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }
        }

        public v get(k key)
        {
            int bi = Hash(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = search(currentBucket , key);
            if(ei != -1)
            {
                Node currNode = currentBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public v remove(k key)
        {
            int bi = Hash(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = search(currentBucket , key);
            if(ei != -1)
            {
                Node currNode = currentBucket.get(ei);
                v val = currNode.value;
                currentBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }


    }
    public static void main(String[] args) {
        MYHashMap<String , Integer> mp = new MYHashMap<>();
        System.out.println("Testing");
        mp.put("Payal",62);
        mp.put("Teju",43);
        System.out.println(mp.get("Teju"));
        System.out.println(mp.size());
        mp.put("Teju",90);
        System.out.println(mp.get("Teju"));
        System.out.println(mp.get("tejuu"));
        System.out.println( mp.remove("Teju"));
        System.out.println(mp.size());
        System.out.println(mp.get("Teju"));
    }
}
