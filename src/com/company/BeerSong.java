package com.company;

public class BeerSong {

    public static void main(String[] args){
        int num = 10;
        int bottles = num;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall");
            System.out.println(bottles-- + " bottles of beer");
            System.out.println("Take one down, pass it around");
            System.out.println(bottles + " bottles of beer on the wall");
            System.out.println("");

            if (bottles == 2) {
                System.out.println(bottles + " bottles of beer on the wall");
                System.out.println(bottles-- + " bottles of beer");
                System.out.println("Take one down, pass it around");
                System.out.println(bottles + " bottle of beer on the wall");
                System.out.println("");
            }

            if (bottles == 1) {
                System.out.println(bottles + " bottle of beer on the wall");
                System.out.println(bottles-- + " bottle of beer");
                System.out.println("Take one down, pass it around");
                System.out.println("No bottles of beer on the wall");
                System.out.println("");
            }

            if (bottles == 0) {
                bottles = bottles + num;
                System.out.println("No bottles of beer on the wall");
                System.out.println("No bottles of beer");
                System.out.println("Go to the store, buy some more");
                System.out.println(bottles + " bottles of beer on the wall");
                return;
            }
        }
    }
}
