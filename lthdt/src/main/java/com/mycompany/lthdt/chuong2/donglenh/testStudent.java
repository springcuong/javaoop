/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.chuong2.donglenh;

import com.mycompany.lthdt.chuong2.employeelogic.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

/**
 *
 * @author Spring Cuong
 */
public class testStudent {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-1999";
        Date ngaysinh = df.parse(input);
        Student obj = new Student("Dai hoc hue","Gioi", "Truong Xuan Cuong", 1, ngaysinh);
        switch(obj.getHocluc())
        {
            case "Xuat sac" -> obj.setHocbong(1000);
            case "Gioi" -> obj.setHocbong(855);
            default -> obj.setHocbong(0);
                
        }
        System.out.println(obj);
    }
}
