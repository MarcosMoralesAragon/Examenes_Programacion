/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio2{ 
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca la longitud total del puente(un numero mayor que 6");
    System.out.print("> ");
    int longitudPuente = Integer.parseInt(System.console().readLine());
    
    while(longitudPuente < 6){
      
      System.out.println("El dato introducido es incorrecto");
      System.out.println("Introduzca la longitud total del puente(un numero mayor que 6");
      System.out.print("> ");
      longitudPuente = Integer.parseInt(System.console().readLine());
      
    }
    
    
    int longitudPuenteArriba = longitudPuente - 4;
    int longitudPuenteEnMedio = longitudPuente - 4;
    int longitudPuenteAbajo = longitudPuente - 2;
    int longitudPuenteParaPrimo = longitudPuenteArriba;
    int numAleatorio = 0;
    
    System.out.println("");
    System.out.print("  ");
    
   do{
      
      numAleatorio = (int)(Math.random() * 6) + 1;
      
      switch(numAleatorio){
        case 1:
        case 2:
          System.out.print("&");
          break;
        case 3:
        case 4:
        case 5:
        case 6:
          System.out.print(" ");
        break;
      }
      
      longitudPuenteParaPrimo--;
      
    }while(longitudPuenteParaPrimo>0);
    
    System.out.println("");
    System.out.print("  ");
    
    do{
      
      System.out.print("*");
      longitudPuenteArriba--;
      
    }while(longitudPuenteArriba>0);
    
    System.out.println("");
    System.out.print(" *");
  
    do{
      
      System.out.print(" ");
      longitudPuenteEnMedio--;
      
    }while(longitudPuenteEnMedio>0);
    System.out.print("*");
    
    
    System.out.println("");
    System.out.print("*");
    
    do{
      
      System.out.print(" ");
      longitudPuenteAbajo--;
      
    }while(longitudPuenteAbajo>0);
    System.out.print("*");
    
    
  }  
}
