/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio4{ 
  public static void main(String[] args) {
    
    System.out.println("Introduzca el número largo positivo: ");
    long numeroTeclado = Long.parseLong(System.console().readLine());
    
    long numero = numeroTeclado;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 

    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    long DetectorPar = volteado;
    long DetectorImpar = numeroTeclado;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(DetectorPar % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        
      }

      DetectorPar /= 10;
    }
    
    System.out.println("");
    System.out.print("Dígitos impares: ");
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(DetectorImpar % 10);

      if ((digito % 2) != 0) {
        System.out.print(digito + " ");
        
      }

      DetectorImpar /= 10;
    }

  }  
}
