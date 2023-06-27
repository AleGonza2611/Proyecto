/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author AZZA PC
 */
public class hilo2 extends Thread{
    private int n;
    private boolean continuar = true;
    
    public hilo2(int n){
        this.n = n;

    }
    
    @Override
    public void run(){
        try{
            while(continuar){
                System.out.println("hilo numero: "+n);
                sleep(2000);
            }
            
        }catch(InterruptedException e){
            System.out.println("hilo numero: "+n);
        
        }
    
    
    }
    
    
    
}
