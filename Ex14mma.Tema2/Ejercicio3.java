/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio3{ 
  public static void main(String[] args) {
    
    String nombre;
    double totalIva04 = 0;
    double totalIva10 = 0;
    double totalIva21 = 0;
    double total = 0;
    int contadorfin=0;
    double restoIva04 = 0;
    double restoIva10 = 0;
    double restoIva21 = 0;
    do{
      
      System.out.println("Introduzca el nombre del producto ('fin' para salir): ");
      nombre = System.console().readLine();
      System.out.println("");
      
      switch (nombre){
        
        case "fin":
        contadorfin ++;
        break;
        
        default:
          System.out.println("Precio por unidad: ");
          double precioConIva = Double.parseDouble(System.console().readLine());
          System.out.println("");
          
          System.out.println("Cantidad del producto: ");
          int cantidad = Integer.parseInt(System.console().readLine());
          System.out.println("");
    
          
    
          System.out.println("-------------------------");
          System.out.println("SELECCIONE EL TIPO DE IVA");
          System.out.println("-------------------------");
          System.out.println("1. 4%");
          System.out.println("2. 10%");
          System.out.println("3. 21%");
          int tipoDeIva = Integer.parseInt(System.console().readLine());
    
          double iva = 0;
    
          switch(tipoDeIva){
            case 1:
              iva = 1.04;
              totalIva04 = totalIva04 + ((precioConIva*cantidad)/iva);
              restoIva04 = precioConIva*cantidad - ((precioConIva*cantidad)/iva);
            break;
      
            case 2:
              iva = 1.1;
              totalIva10 = totalIva10 + ((precioConIva*cantidad)/iva);
              restoIva10 = precioConIva*cantidad - ((precioConIva*cantidad)/iva);
            break;
      
            case 3:
              iva = 1.21;
              totalIva21 = totalIva21 + ((precioConIva*cantidad)/iva);
              restoIva21 = precioConIva*cantidad - ((precioConIva*cantidad)/iva);
            break;
          }
      
          total = total + precioConIva;
        break;
      }
      
    }while (contadorfin == 0);
    
    System.out.println("");
    System.out.println("TOTAL :" + total);
    System.out.printf(" Base imponible 4%:" + totalIva04 + "  IVA: " + restoIva04);
    System.out.printf(" Base imponible 10%: " + totalIva10 + "  IVA:" + restoIva10);
    System.out.printf(" Base imponible 21%: " + totalIva21 + "  IVA: " + restoIva21);
    
  }  
}
