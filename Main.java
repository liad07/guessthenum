package com.company;
import  java.util.*;
public class Main {
public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        int num=1+(int)(Math.random()*(100));
        System.out.println("Try to guess which number I chose from 1 to a hundred");
        int guses= reader.nextInt();
        int i=0;
        while (true) {
            if (i>0){
                System.out.println("try another num");
                 guses= reader.nextInt();

            }
            if (guses > num) {
                System.out.println("you enter " + guses);
                System.out.println("to high");
                i++;
            }
            if (guses < num) {
                System.out.println("you enter " + guses);
                System.out.println("to low");
                i++;
            }
            if (guses == num) {
                System.out.println("you enter " + guses);
                System.out.println("i pick " + num);
                System.out.println("you win");
                break;
            }
        }
    }
}
