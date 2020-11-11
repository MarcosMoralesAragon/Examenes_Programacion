/**
 * Programa que recorta los dígitos que tiene un numero y muestra en pantalla
 * la cantidad que indica el primer número de la sucesión
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio3 { 
  public static void main(String[] args) {
    
    //Lee el numero que le introducimos
    System.out.println("Introduce el número al que deseas realizar esta operación");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numeroInicial = numero;
    int numeroDeRepeticiones = 0;
    int primerDigito = 0;
    int calculo;
    int divisor = 1;
    
    //Divide el numero entre 10 hasta que detecta que es menor que 10 y guarda el numero
    do {
      numero = numero /10;
      numeroDeRepeticiones = numeroDeRepeticiones + 1;
      
      if (numero < 10) {
        primerDigito = numero;
      }
      
    } while (primerDigito == 0);
    
    //Este calculo es el que le permite saber cuantas veces tiene que dividir entre 10 el numero original
    numeroDeRepeticiones= numeroDeRepeticiones + 1;
    calculo = numeroDeRepeticiones - primerDigito;
    
    if (calculo < 0) {
      System.out.println("El número reducido es " + numeroInicial);
    } else {
      do {
    divisor = divisor * 10;
    calculo= calculo - 1;
    } while (calculo > 0);
    
    System.out.println("EL numero reducido es " + numeroInicial/divisor);
    }
	}
}
