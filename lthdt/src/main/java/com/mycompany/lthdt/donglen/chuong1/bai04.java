/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglen.chuong1;

/**
 *
 * @author Spring Cuong
 */
public class bai04 {
    public static void main(String[] args){
        Shape htron = new Circle(5, 1, 2);
//        System.out.println("Chu vi cua hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich cua hinh tron la " + htron.calcArea());
        
        Shape hchunhat = new Rectangle(3, 15, 8, 5);
//        System.out.println("Chu vi cua hinh chu nhat la " + hchunhat.calcPerimeter());
//        System.out.println("Dien tich cua hinh chu nhat la " + hchunhat.calcArea());
        System.out.println(hchunhat);
        System.out.println(htron);
    }
}