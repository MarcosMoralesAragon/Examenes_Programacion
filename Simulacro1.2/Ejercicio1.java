/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio1{ 
  public static void main(String[] args) {
    
   System.out.println("Introduce la altura del hola que desea generar (que sea un numero impar mayor o igual a 3)");
   System.out.print("> ");
   int numero = Integer.parseInt(System.console().readLine());
  
   int comprobante = 0;
  
    if ((numero < 3) || (numero % 2 == 0)){
    comprobante = comprobante +1;
    }
  
   while(comprobante > 0){
    System.out.println("");
    System.out.println("Numero erroneo, lea las condiciones");
    System.out.print("> ");
    numero = Integer.parseInt(System.console().readLine());
    comprobante = comprobante -1;
    if ((numero < 3) || (numero % 2 == 0)){
    comprobante = comprobante +1;
    }
   }
  
   int numeroDeLineasAPintar = numero - 3;
   int printPorGrupo = numeroDeLineasAPintar/2;
   int grupo1 = printPorGrupo;
   int grupo2 = printPorGrupo;
  
  System.out.println("");
   System.out.println("*    *   ****  *       ****");
    if (grupo1>0) {
      do{
      System.out.println("*    *  *    * *      *    *");
      grupo1 = grupo1-1;
      }while (grupo1>0);
    }
  
   System.out.println("******  *    * *      ******");
    if (grupo2>0) {
      do{
      System.out.println("*    *  *    * *      *    *");
      grupo2 = grupo2-1;
      }while (grupo2>0);
    }
   System.out.println("*    *   ****  ****** *    *");
  }
}
