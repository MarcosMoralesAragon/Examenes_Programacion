/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ex14mma3{ 
  public static void main(String[] args) {
    
    System.out.println("Introduzca el número al que desea realizar la operación");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    int suma = 0;
    int ultimoNumero = 0;
    
    while (numero > 0){
      
      ultimoNumero = numero % 10;
      numero = numero / 10;
      
      suma = suma + ultimoNumero;
    }
    
    System.out.println("La suma de sus dígitos es: " + suma);
  }
}
