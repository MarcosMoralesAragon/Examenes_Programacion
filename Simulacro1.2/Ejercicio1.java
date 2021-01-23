/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio1{ 
  public static void main(String[] args) {
    
    System.out.println("Introduce la altura del hola que desea generar (que sea un numero impar mayor o igual a 3)");
    System.out.print("> ");
    
    int alturaIntroducida = 0;
    boolean alturaCorrecta = false;
    
    while(!alturaCorrecta){
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      alturaCorrecta = true;
     
      if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)){
        alturaCorrecta = false;
        System.out.println("");
        System.out.println("Numero erroneo, lea las condiciones");
        System.out.print("> ");
      }
    }
  
    int numeroDeLineasAPintar = alturaIntroducida - 3;
    int printPorGrupo = numeroDeLineasAPintar/2;
    int grupo1 = printPorGrupo;
    int grupo2 = printPorGrupo;
  
    System.out.println("");
    System.out.println("*    *   ****  *       ****");
    
    if (grupo1>0) {
      do{
        System.out.println("*    *  *    * *      *    *");
        grupo1 --;
      }while (grupo1>0);
    }
  
    System.out.println("******  *    * *      ******");
    
    if (grupo2>0) {
      do{
        System.out.println("*    *  *    * *      *    *");
        grupo2 --;
      }while (grupo2>0);
    }
   System.out.println("*    *   ****  ****** *    *");
  }
}
