/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ex14mma1{ 
  public static void main(String[] args) {
  
    System.out.println("Este programa pinta una piramide (de altura mayor o igual a 4) ");
    System.out.println("Porfavor, introduzca la altura de la piramide : ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    
    while (altura < 4){
      
      System.out.println("Error en altura, introduzca otra vez la altura:");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
    }
  
    int caracterPorLinea = 1;
    int vecesAImprimir = 0;
    int espacios = 0;
    int contadorParaCuspide = 0;
    int contadorParaEspaciosIntermedios = 0;
    int espaciosEnMedio = 1;
    int espaciosEnMedioContador = 0;
    
    do{
      vecesAImprimir = caracterPorLinea;
      espacios = altura;
      
      do{
      
        System.out.print(" ");
        espacios = espacios -1;
      
      }while (espacios > 0);
      
      do{
        
       System.out.print("*");
       vecesAImprimir = vecesAImprimir - 1;
       
      }while (vecesAImprimir > 0);
      
      System.out.println("");
      altura = altura -1;
      caracterPorLinea = caracterPorLinea + 2;
      contadorParaCuspide ++;
      
    }while(contadorParaCuspide < 2);
  
  
    do{
      
      vecesAImprimir = 4;
      espacios = altura ;
      espaciosEnMedioContador = espaciosEnMedio;
      
      do{
      
        System.out.print(" ");
        espacios = espacios -1;
      
      }while (espacios > 0);
      
      do{
        
        if (contadorParaEspaciosIntermedios == 2){
          
          while (espaciosEnMedioContador > 0){
            
            System.out.print(" ");
            espaciosEnMedioContador --;
          }
        }
        
        System.out.print("*");
        vecesAImprimir = vecesAImprimir - 1;
        contadorParaEspaciosIntermedios ++;
       
      }while (vecesAImprimir > 0);
      
      System.out.println("");
      altura = altura -1;
      espaciosEnMedio = espaciosEnMedio + 2;
      contadorParaEspaciosIntermedios = 0;
      caracterPorLinea = caracterPorLinea + 2;
      
    }while(altura > 2);
    
    do{
      vecesAImprimir = caracterPorLinea;
      espacios = altura;
      
      do{
      
        System.out.print(" ");
        espacios = espacios -1;
      
      }while (espacios > 0);
      
      do{
        
       System.out.print("*");
       vecesAImprimir = vecesAImprimir - 1;
       
      }while (vecesAImprimir > 0);
      
      System.out.println("");
      altura = altura -1;
      caracterPorLinea = caracterPorLinea + 2;
      
    }while(altura > 0);
    
  }
}
