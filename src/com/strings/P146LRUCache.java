package com.strings;

import sun.misc.LRUCache;

import java.util.LinkedHashMap;

public class P146LRUCache {

    LinkedHashMap<Integer, Integer> map;
    int capacity;
    public P146LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {

        if(map.containsKey(key)){
            int val = map.get(key);
            move_to_last(key);
            return val;
        }

        return -1;

    }

    public void put(int key, int value) {

        if(map.containsKey(key)) {
            move_to_last(key);
        }
            map.put(key, value);
            if(map.size() > capacity){
                delete_first();
        }

    }

    public void move_to_last(int key){
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
    }


    public void delete_first(){
        map.remove(map.keySet().iterator().next());
    }

    public static void main(String ... args){

        P146LRUCache pb = new P146LRUCache(2);

        pb.put(1,1);
        pb.put(2,2);
        System.out.println(pb.get(1));
        pb.put(3,3);
        System.out.println(pb.get(2));
        pb.put(4,4);
        System.out.println(pb.get(1));
        System.out.println(pb.get(3));
        System.out.println(pb.get(4));



    }
}
