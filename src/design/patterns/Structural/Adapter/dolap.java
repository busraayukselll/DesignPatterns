/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.Structural.Adapter;

/**
 *
 * @author busra
 */
public class dolap implements eEvAletleri{
    private final int volt;
    
    public  dolap(){
    this.volt=50;
}
    @Override
    public int prizeTakVeCalistir(){
    System.out.println("telefon ");
    return volt;
            }
    
}
