/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor;

/**
 *
 * @author BRYAN VERA
 */
public class Contador {
    private int count = 0;
    
    public synchronized void incrementarContador() {
        count++;
    }
     
    public synchronized void decrementarContador() {
        count--;
    }
    
    public synchronized int getCount() {
        return count;
    }
}
