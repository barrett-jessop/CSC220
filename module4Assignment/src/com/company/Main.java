package com.company;

import java.util.LinkedList;

public class Main {

    public static void main (String[] args){

        LinkedList<String> carBrands = new LinkedList<String>();
        carBrands.add("Acura");
        carBrands.add("BMW");
        carBrands.add("Buick");
        carBrands.add("Cadillac");
        carBrands.add("Bentley");
        carBrands.add("Chevrolet");
        carBrands.add("Ford");
        carBrands.add("Audi");
        carBrands.add("Honda");
        carBrands.add("Jeep");
        carBrands.add("Jaguar");
        carBrands.add("Kia");
        carBrands.add("Lexus");
        carBrands.add("Land Rover");
        carBrands.add("Lincoln");
        carBrands.add("Tesla");
        carBrands.add("GMC");
        carBrands.add("Dodge");
        carBrands.add("Nissan");
        carBrands.add("Toyota");
        System.out.println(carBrands);

        if(carBrands != null){
            carBrands.addFirst("Mazda");
            carBrands.addLast("Mercedes-Benz");
            carBrands.add(3,"Volvo");
        }
        System.out.println(carBrands);

        String get = carBrands.get(3);
        System.out.println(get);

        carBrands.toString();
        System.out.println(carBrands);

        Object carBrandsClone = carBrands.clone();
        System.out.println(carBrandsClone);

        carBrands.clear();
        System.out.println(carBrands);
    }


}
