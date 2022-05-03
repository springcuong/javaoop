/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author Spring Cuong
 */
public class testFor {
    public static void main(String[] args){
        //Tinh tong thu nhat
        int n = 20;
        double s = 0;
        for(int i = 1; i <= n; i++){
            s = s + (double)1/i;
        }
        System.out.println("Tong thu nhat la " + s);
        //Tinh tong thu hai
        n = 99;
        int s2 = 0;
        for(int i = 1; i <= n; i+=2){
            s2 = s2 + i;
        }
        System.out.println("Tong so thu hai la " + s2);
        
        //Sinh ngau nhien n so nguyen
        Random rnd = new Random();
        int x;
        for(int i = 0; i < 10; i++){
            x = rnd.nextInt(101);
            System.out.println(x);
        }
    }
}
