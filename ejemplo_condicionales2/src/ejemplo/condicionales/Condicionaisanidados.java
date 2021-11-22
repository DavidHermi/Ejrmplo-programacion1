
package ejemplo.condicionales;

import javax.swing.JOptionPane;


public class Condicionaisanidados {
    
    
    
    
    
    public void condiAnidados (){
    
    int num1 = lerEnteiro();
    int num2 = lerEnteiro();
    
    if(num1>num2)
    {
        System.out.println(num1 +"es mayor" + num2);
    
    }   
    
    else if (num1 == num2)
    {
    
    
        System.out.println("son iguales");    
    }
        else
        
    {          
//        System.out.println( num2 +"es mayor");
    
    }
    
     System.out.println("remata o if");
    
    
    
    
        
        
        
        
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int lerEnteiro () {
    
    String resposta = JOptionPane.showInputDialog("teclea numero entero:");
    int num =Integer.parseInt (resposta);
    //tamen
//    int num - Integer.parseInt(JOptionPane.showInputDialog("teclea numero"))
    return num;
    
    
    }
    
    
    
    
    
}
