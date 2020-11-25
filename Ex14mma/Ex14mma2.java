/**
 * Ejercicio 2 del examen de programación
 *
 * @author MarcosMoralesAragon
 */
public class Ex14mma2{ 
  public static void main(String[] args) {
    
    System.out.println("Bienvenido a Cines Coliseo, introduce el día que quieres ir al teatro");
    System.out.println("---------------------------------------------------------------------");
    System.out.print("> ");
    String diaSemana = System.console().readLine();
    System.out.println("");
    
    
    System.out.println("¿Cuantas entradas desea?");
    System.out.print("> ");
    int cantidadEntradas = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    
    int entradasParejas = 0;
    int entradasIndividuales = cantidadEntradas;
    int entradas = cantidadEntradas;
    double precioBase = 10;
    double precioPareja = 0;
    double total = 0;
    double descuento = 0;
    double pago = 0;
    
    
    switch (diaSemana){
      case "miercoles":
      
        precioBase = 8;
        
      break;
      
      case "jueves":
        
        while (entradas > 1){
          
          entradasParejas ++;
          entradas = entradas -2;
        }
        
        precioPareja = 15;
        entradasIndividuales = cantidadEntradas % 2;
        
      break;
    }
    
    
    System.out.println("¿Tiene usted tarjeta coliseo?");
    System.out.println("-----------------------------");
    System.out.println("1.Si");
    System.out.println("2.No");
    System.out.println("-----------------------------");
    System.out.print("> ");
    int tarjetaColiseo = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    
    if (entradasParejas > 0){
      
      System.out.printf("Entradas de pareja            %2d\n", entradasParejas);
      System.out.printf("Precio por entrada de pareja  %5.2f €\n", precioPareja);
      
    }
    
    if (entradasIndividuales > 0){
      
      System.out.printf("Entradas individuales         %2d\n", entradasIndividuales);
      System.out.printf("Precio por entrada individual %5.2f €\n", precioBase);
      
    }
    
    total = (precioBase * entradasIndividuales) + (precioPareja*entradasParejas);
    
    if (tarjetaColiseo < 2){
      
      descuento = total * 0.1;
      
    }
    
    pago = total - descuento;
    
    System.out.printf("Total                         %5.2f €\n", total);
    System.out.printf("Descuento                     %5.2f €\n", descuento);
    System.out.printf("A pagar                       %5.2f €\n", pago);
    
  }
}
