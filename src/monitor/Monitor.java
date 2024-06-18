/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitor;

/**
 *
 * @author BRYAN VERA
 */
public class Monitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        byte ite = 10;
        while(ite >= 0){
            
        Contador c1 = new Contador();
        
        // Creación de múltiples hilos 
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.incrementarContador();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.incrementarContador();
            }
        });
        
        //Inicialización de los hilos
        t1.start();
        t2.start();
        
        //Ejecución de los hilos
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtención del valor final del contador
        System.out.println("Valor final del contador: " + c1.getCount());

        ite--;
        }
        
    }
    
}
