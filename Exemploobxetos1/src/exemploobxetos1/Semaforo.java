
package exemploobxetos1;


public class Semaforo {
    // atributos //
    private String cor ;
    
    
    
    
    
    
    // metodos //
public void ponCor (String c){
    cor = c;
    
    
    
};    

public String dameCor () {
    
    return cor;
    
    
    
    
}
    
    
    public Semaforo mudarcor(Semaforo   obxetosemaforo ) {
        
      obxetosemaforo.cor = "negro";
        
      return obxetosemaforo;
      
        
        
    } 
    
    
    
    
}
