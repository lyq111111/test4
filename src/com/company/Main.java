package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int z = x / 7;
       int y = x % 7;
        System.out.println("周：" + z + "天："+ y);



    }
}
