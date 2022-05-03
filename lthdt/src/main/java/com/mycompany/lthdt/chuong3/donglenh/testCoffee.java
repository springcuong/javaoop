/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt.chuong3.donglenh;

import com.mycompany.lthdt.chuong3.coffelogic.CoffeeShop;
import com.mycompany.lthdt.chuong3.coffelogic.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author Spring Cuong
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),new CoffeeShop("White House", "3 Nguyen Hue"),
        new CoffeeShop("Black House", "6 Nguyen Hue")};
        Manager[] managers = new Manager[]{
            new Manager(new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue")},1000, "Le Thi A", 0, df.parse("12-12-1999")),
        new Manager(a, 2000, "Nguyen Van Luong", 0, df.parse("12-12-2001"))
        };
        System.out.println(Arrays.toString(managers));
    }
}
