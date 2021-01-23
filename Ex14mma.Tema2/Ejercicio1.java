/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio1{ 
  public static void main(String[] args) {
    
    
    int contadorPrimo = 0;
    int comprobacion = 0;
    int contador = 0;
    int repeticiones = 0;
    int numAleatorio = 0;
    
    do{
      
      numAleatorio = ((int)(Math.random()*100) +2);
      numAleatorio = (numAleatorio * 2) - 1;
    
      contador = 0;
      
      for (int i = 1; i<=numAleatorio;i++){
        
        comprobacion = numAleatorio % i;
        
        if (comprobacion == 0){
          
          contador ++;
        }
        
        
      }
      
      if (contador > 2){
        
        contadorPrimo++;
        
      }
      System.out.print(numAleatorio + " ");
      repeticiones ++;
      
    }while(contadorPrimo == 0);
    
    System.out.println("");
    System.out.println("Se han generado "+ repeticiones + " números impares aleatorios");
    
  }  
}
