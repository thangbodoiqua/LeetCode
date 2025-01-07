package DataStructure.Hashh;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 100;
    private ArrayList<Integer>[] myBuckets;
    public MyHashSet(){
        myBuckets = new ArrayList[1000];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }
    public int HashFunction(int key){
        return key % SIZE;
    }
    public void add(int key){
        int hashValueIndex = HashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);


    }
    public int get(int key){
        int hashValueIndex = HashFunction(key);

        return 0;
    }
    public void remove(int key){
        int hashValueIndex = HashFunction(key);

    }
    public boolean containts(int key){
        int hashValueIndex = HashFunction(key);

        return true;
    }


}
