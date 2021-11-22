/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.condicionales;

import java.util.Scanner;
public class condicionalsimple {
    
    
    
  // dados dos numeros visualizar si el primero es mayor que el segundo  //
    
    
    
    
    Scanner sc ;
    
    
 public void cosSimple (){
 
 
 Scanner sc =new Scanner (System.in);
     
   int num1 = pedirEnteiro();
 int num2 = pedirEnteiro ();  
  
    
    // condicional //
    
    
    if (num1 >num2){
            System.out.println(num1 +"es mayor que"+num2);
    }
     System.out.println("remata o if");
 
 }
    
    
   public int pedirEnteiro () {
   
     System.out.println("teclea el numero enteiro :");
     int num= sc.nextInt();
  return num ;
   
   
   
   } 
    

    
    
    
    
    
  
}
