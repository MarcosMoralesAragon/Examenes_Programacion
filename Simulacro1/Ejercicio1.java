/**
 * Este programa crea presupuesto para una tienda de ropa que vende polos,
 * este código automatiza esta funcion y la hace mas rapida y sencilla
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio1 { 
  public static void main(String[] args) {
    
    //Apartado que se encarga de recoger el número de polos que requiere el comprador
    System.out.print("Hola, bienvenido a EL POLITO BONITO, este programa le ayudara");
    System.out.println(" a generar un presupuesto sobre el pedido que usted va a realizar");
    System.out.println("");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("");
    System.out.print("Empecemos por lo basico, porfavor introduce la cantidad");
    System.out.println(" deseada de polos (recuerde que el mínimo son 20 unidades)");
    System.out.print("Cantidad de polos: ");
    int polo = Integer.parseInt(System.console().readLine());
    
    //Apartado que se encarga de recoger la informacion del color de los polos
    System.out.println("");
    System.out.println("--------------------------------------");
    System.out.println("¿Desea que los polos sean de color?");
    System.out.println("--------------------------------------");
    System.out.println("1. SI");
    System.out.println("2. NO");
    System.out.print("> ");
    int color = Integer.parseInt(System.console().readLine());
    
    //Apartado que se encarga de recoger la información de la serografia
    System.out.println("");
    System.out.println("--------------------------------------");
    System.out.println("¿Desea que los polos tengan serografia?");
    System.out.println("--------------------------------------");
    System.out.println("1. SI");
    System.out.println("2. NO");
    System.out.print("> ");
    int serografia = Integer.parseInt(System.console().readLine());
    
    //Apartado que se encarga de recoger la información sobre los bordados
    System.out.println("");
    System.out.println("--------------------------------------");
    System.out.println("¿Desea que los polos sean bordados?");
    System.out.println("--------------------------------------");
    System.out.println("1. SI");
    System.out.println("2. NO");
    System.out.print("> ");
    int bordado = Integer.parseInt(System.console().readLine());
    
    //Inicio de los calculos para el presupuesto
    //Iniciamos las variables
    
    double precioPolo = 0;
    double precioPoloFinal = 0;
    double precioSerografiaPorUnidad = 0;
    double precioBordadoPorUnidad = 0;
    
    //Este apartado se encarga de analizar cuantos polos ha pedido el cliente y
    // asignarle el precio por unidad que le corresponde
    if (polo <= 39) {
      precioPolo = 4.90;
    }else if ((polo > 39) && (polo <=99)){
      precioPolo = 3.90;
    }else if (polo >= 100) {
      precioPolo = 3.20;
    }
    
    //Aquí se detecta si el usuario ha pedido que tenga color o no y se pone el
    // porcentaje si es necesario
    switch (color) {
      case 1:
        precioPoloFinal = precioPolo * 1.20;
        break;
      case 2:
        precioPoloFinal = precioPolo;
        break;
    }
    
    
    //En este siguiente apartado detectara si el usuario ha pedido serografia o no
    switch (serografia) {
      case 1:
        if (polo < 50) {
          precioSerografiaPorUnidad = 2;
        }else if (polo>50) {
          precioSerografiaPorUnidad = 1.5;
        }
        break;
      case 2:
        precioSerografiaPorUnidad = 0;
        break;
    }
    
    //En este siguiente apartado detectara si el usuario ha pedido bordado o no
    switch (bordado) {
      case 1:
        if (polo < 50) {
          precioBordadoPorUnidad = 3;
        }else if (polo>50) {
          precioBordadoPorUnidad = 2.5;
        }
        break;
      case 2:
        precioBordadoPorUnidad = 0;
        break;
    }
    
    //Empiezan los calculos de todos estos valores y muestra por pantalla los resultados
    
    double precioTotalSinIva = (polo*precioPoloFinal + precioSerografiaPorUnidad*polo + precioBordadoPorUnidad*polo );
    
    System.out.println("EL POLITO BONITO - PRESUPUESTO");
    System.out.println("");
    System.out.println("Cantidad de polos pedidos:     " + polo + " u");
    System.out.println("Precio unitario de cada uno:   " + precioPoloFinal + " euros");
    System.out.println("Total textil:                  " + (polo*precioPoloFinal));
    System.out.println("Serografia (por unidad):       " + precioSerografiaPorUnidad + " euros");
    System.out.println("Serografia (total):            " +  + (precioSerografiaPorUnidad*polo) + " euros");
    System.out.println("Logotipo (por unidad):         " + precioBordadoPorUnidad + " euros");
    System.out.println("Logotipo (por unidad):         " + (precioBordadoPorUnidad*polo) + " euros");
    System.out.println("Total sin IVA:                 " + precioTotalSinIva);
    System.out.println("Total con IVA:                 " + (precioTotalSinIva*1.21));
	}
}
