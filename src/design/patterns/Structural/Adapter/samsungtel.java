/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.Structural.Adapter;

/**
 *
 * @author busra
 */
public class samsungtel implements telefon{
    private int calismaVoltaji;
    public samsungtel(){
        calismaVoltaji=5;

    }
    @Override
    public int sarjEt(){
        System.out.println("samsung telefon sarj ediliyor");
        return calismaVoltaji;
    }
    
}
