/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.Structural.Adapter;

/**
 *
 * @author busra
 */
public class Utu implements eEvAletleri{
    private final int volt;
    
    public  Utu(){
    this.volt=220;
}
    @Override
    public int prizeTakVeCalistir(){
    System.out.println("UTU ");
    return volt;
            }
    
}
