/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.condicionales;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class condicionaldoble {
    
// pedir 2 numeros y visualizar el mayor //
    
     
    Scanner sc ;
    
    
 public void cosDoble(){
 
 
  sc =new Scanner (System.in);
  
      int num1 = pedirEnteiro();
 int num2 = pedirEnteiro ();  
     
 
    
    // condicional //
    
    
    
    
    
    
    if (num1 >num2){
            System.out.println(num1 +"es mayor que"+num2);
    }
    else 
    {
    
        System.out.println(num2+"es mayor que"+num1);
    }
    
    
    
    
    
    
    
     System.out.println("remata o if");
 

 }
    
    
   public int pedirEnteiro () {
   
     System.out.println("teclea el numero enteiro :");
     int num= sc.nextInt();
  return num ;
   
   
   
   } 
    

    
    
    
    
    
}
