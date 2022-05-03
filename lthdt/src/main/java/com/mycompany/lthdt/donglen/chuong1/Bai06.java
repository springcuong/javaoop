/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglen.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

/**
 *
 * @author Spring Cuong
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1, ngaysinh);
        System.out.println("Ho ten: " + person.getHoten() + "; Gioi Tinh: " + person.getGioitinh() + "; Ngay Sinh: " + df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("14-09-2003"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println("Ho ten: " + sinhvien.getHoten() + "; Gioi tinh: " + sinhvien.getGioitinh() + "; Ngay sinh: "
                + df.format(sinhvien.getNgaysinh())+ "; Truong hoc: " + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Van Hue");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("15-03-2003"));
        congnhan.setCongty("Cong ty San Xuat Luu Dan");
        System.out.println("Ho ten: " + congnhan.getHoten() + "; Gioi tinh : " + congnhan.getGioitinh() + "; Ngay sinh: "
                + df.format(congnhan.getNgaysinh()) + "; Cong ty : " + congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }
}
