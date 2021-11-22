/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploobxetos1;

public class Exemploobxetos1 {

  
    public static void main(String[] args) {
        
      Semaforo unSemaforo   = new Semaforo ();
      unSemaforo.ponCor("azul");
      String co= unSemaforo.dameCor();
      System.out.println( co );
        
       Semaforo outroSemaforo = new Semaforo ();
       outroSemaforo.ponCor("amarillo");
       String color= outroSemaforo.dameCor();
       System.out.println(" a cor e :"+outroSemaforo.dameCor());
       
        Semaforo terceiroSemaforo   = new Semaforo ();

       System.out.println(terceiroSemaforo.dameCor());
       Semaforo obx=terceiroSemaforo.mudarcor (terceiroSemaforo);
       
       
        
       
    }
    
}
