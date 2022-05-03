/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt.chuong3.donglenh;

import java.util.Random;

/**
 *
 * @author Spring Cuong
 */
public class test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matran;
        matran = new int[5][7];
        Random rnd = new Random();
        for(int i = 0; i<matran.length;i++){
            for(int j = 0; j< matran[i].length; j++){
                matran[i][j] = rnd.nextInt(1000);
            }
        }
        for(int i = 0; i <  matran.length; i++)
            for(int j = 0; j < matran[i].length; j++)
                System.out.print(matran[i][j] + " ");
            System.out.println();
    }
    
}
