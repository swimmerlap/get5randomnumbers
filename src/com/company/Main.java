//Print a 5 random numbers given a bound.

//there is another verison online


package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int index = getRandom(num);
        System.out.println(index);
	// write your code here
    }

    public static int getRandom(int num){
        Random ran = new Random();
        int index=0;
        for(int counter=1; counter<=5; counter++){
            index = ran.nextInt(num);
        System.out.println(index);
        }
        return index;
    }

}
