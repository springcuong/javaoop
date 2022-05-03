/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt.chuong3.donglenh;

import com.mycompany.lthdt.chuong3.coffelogic.Product;
import com.mycompany.lthdt.chuong3.coffelogic.ProductCompByName;
import com.mycompany.lthdt.chuong3.coffelogic.ProductCompByPrice;
import java.util.Arrays;

/**
 *
 * @author Spring Cuong
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Product[] sp = new Product[]{new Product("Sunsilk", 12),
            new Product("Lifebout", 5),
            new Product("Cafe", 23),
            new Product("Thien Long", 1)};
        System.out.println("Mang ban dau la");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for(int i = 0; i < sp.length - 1; i++)
//            for(int j = i + 1; j < sp.length;j++){
//                if(sp[i].getPrice() > sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }                
//            }
//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mang sau khi sap xep tang dan gia ca");
//        System.out.println(Arrays.toString(sp));
        System.out.println("Sap xep san pham theo ten san pham");
        Arrays.sort(sp, new ProductCompByName());
        System.out.println(Arrays.toString(sp));
        int index = Arrays. binarySearch(sp, new Product ("Sunsilk", 12), new ProductCompByName ()) ;
        if (index < 0){
            System.out.println("Khong tim thay") ;
        }else{
            System.out.println("Phan tu thu " + index + " chua gia tri can tim");
            System.out.println(sp[index]) ;
        }
        }
}
