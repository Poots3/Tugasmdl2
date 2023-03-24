package com.mycompany.latihan;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Animal = new LinkedList<>();
        Animal.add("Sapi");
        Animal.add("Kambing");
        Animal.add("Kelinci");
        Animal.add("Unta");
        Animal.add("Kelinci");
        Animal.add("Domba");
            System.out.println("Hewan: " +Animal);
            System.out.println();


        LinkedList<String> deleteAnimal = new LinkedList<>();
        deleteAnimal.add("Kelinci");
        deleteAnimal.add("Kambing");
        deleteAnimal.add("Unta");
        System.out.println("Beberapa Hewan ynag dihapus: ");
        System.out.print(deleteAnimal);
        System.out.println();


        Iterator<String> iterator = Animal.iterator();
        while(iterator.hasNext()){
            String animal = iterator.next();
            if(deleteAnimal.contains(animal)){
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("hasil akhir dari penghapusan hewan:");
        for(String animal : Animal){
            System.out.println(animal);
        }
    }
}