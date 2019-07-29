package com.nishan;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap()  //this process is usefull to add multiple key value
        {{
           put(1,"nishan");
           put(2,"mishal");
           put(3,"Ariful");
        }};

        System.out.println(hashMap);

        Stream streamHashMap = hashMap.entrySet().stream();
        streamHashMap.forEachOrdered((n)-> System.out.println(n));
        System.out.println(hashMap.get(2)); // print value by key

        System.out.println(getKeysByValue(hashMap,"mishal"));

        Object keyValue = getKeysByValue(hashMap,"nishan");
        System.out.println(keyValue);
        
        }

        // below method is to find the key of a value by java 8 api
    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        return map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

}
