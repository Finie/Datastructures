package com.company;

import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
	// write your code here


        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(80);
        list.addLast(9);
        list.addLast(120);
        list.addLast(121);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addMiddle(57);
        list.deleteFirst();
        list.deleteLast();
        System.out.println("Index is "+list.indexOf(40));
        System.out.println("Median element is "+list.getMedianItem());
        System.out.println("is Contained ? "+list.contains((587)));
        System.out.println("Length "+list.length());

        for (int i =0; i < list.length(); i++){
            System.out.println(list.getItemAtIndex(i));
        }




    }















    private static int factorial(int n){
      //this function is used to get the factorial of a number in recursion
        if (n == 1){
            return  1;
        }
        return  n * factorial( n-1);
    }


    private  static int iteration(int n){
    // this function is used to get the factorial of nth integer through iteration
        int result = 1;
        for (int i = 1; i<=n ; i++){
            result = result*i;
        }
        return  result;
    }



}
