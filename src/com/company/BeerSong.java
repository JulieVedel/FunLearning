package com.company;

public class BeerSong {

    public static void main(String[] args){
        int bottles = 10;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall");
            System.out.println(bottles-- + " bottles of beer");
            System.out.println("Take one down, pass it around");
            System.out.println(bottles + " bottles of beer on the wall");
            System.out.println("");
        }
    }
}
