/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ex14mma4{ 
  public static void main(String[] args) {
    
    System.out.println("Introduza la longitud del tallo en milimetro: ");
    System.out.print("> ");
    int medida = Integer.parseInt(System.console().readLine());
    
    int ultimoNumero = 0;
    int cantidadDeOchos = 0;
    int cantidadDeSietes = 0;
    
    while (medida >0){
      
      ultimoNumero = medida % 10;
      medida = medida / 10;
      
      if (ultimoNumero == 7){
        
        cantidadDeSietes ++;
        
      } else if (ultimoNumero == 8) {
        
        cantidadDeOchos ++;
        
      }
    }
    
    if ((cantidadDeSietes < 3) && (cantidadDeOchos > 1)) {
    
      System.out.println("Este girasol es un gran captador");
    
    } else {
      
      System.out.println("Este girasol no es un gran captador");
      
    }
  }
}
