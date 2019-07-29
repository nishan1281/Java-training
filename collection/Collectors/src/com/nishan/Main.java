package com.nishan;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Products> productList = new ArrayList<Products>();

        productList.add(new Products(1,"HP Laptop", 25000f));
        productList.add(new Products(2,"Dell Laptop",20000f));
        productList.add(new Products(3,"Apple Laptop",35000f));

       //fetching price

        List<Float> productPriceList  = productList.stream().map(x->x.getPrice()).collect(Collectors.toList());
        System.out.println(productPriceList);

        //using sum method
        Double sumPrices = productList.stream().collect(Collectors.summingDouble(x->x.getPrice()));
        System.out.println("Sum of prices : "+sumPrices);

        //Getting Product Average Price
        Double averagePrice = productList.stream().collect(Collectors.averagingDouble(p->p.getPrice()));
        System.out.println("Average price : " + String.format("%.2f",averagePrice));

        //Counting

        Long noOfElements = productList.stream()
                            .collect(Collectors.counting());
        System.out.println("Total Elements : " + noOfElements);



    }
}
