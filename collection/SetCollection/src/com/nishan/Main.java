package com.nishan;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        Collections.addAll(fruits,"Apple", "Mango", "Gripe","Apple");

//        Stream<String> fruitsStream = fruits.stream();
//        fruitsStream.forEachOrdered(System.out::println);
        //fruitsStream.forEachOrdered((n)->System.out.println(n));

        Set<String> fruitSet = fruits.stream()
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(fruitSet);

        Collection<String> noDups = new HashSet<String>(fruits);
        System.out.println(noDups);

        Set<String> set = fruits.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

    }
}
