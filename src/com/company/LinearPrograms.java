package com.company;
import java.util.Scanner;

public class LinearPrograms {
    public static void main(String[] args){
        LinearPrograms.task1();
    }
    public static void task1(){
        System.out.println("Введите a, b, c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double z = ( (a-3) *b / 2 ) + c;
        System.out.println(z);
    }





}
