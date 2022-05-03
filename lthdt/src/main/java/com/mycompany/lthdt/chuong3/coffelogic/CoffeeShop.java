/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.chuong3.coffelogic;

/**
 *
 * @author Spring Cuong
 */
public class CoffeeShop {
    private String name, address;
    
    public CoffeeShop() {
    }
        
    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
