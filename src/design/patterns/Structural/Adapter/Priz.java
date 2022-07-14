/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.Structural.Adapter;

/**
 *
 * @author busra
 */
public class Priz {
    public void elektirikVer(eEvAletleri elektiriklievalaetleri){
    
    int volt = elektiriklievalaetleri.prizeTakVeCalistir();
    System.out.println("Prizden" + volt +" volt alınıyor.");
    }
    
}
