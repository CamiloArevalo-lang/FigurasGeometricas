package App;

import Model.Circulo;
import Model.Cuadrado;
import Model.Rectangulo;
import Model.TrianguloRectangulo;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("");
        

     Circulo objCirculo = new Circulo(9);
       System.out.println("El área del ciruculo es: "+objCirculo.calcularArea());
       System.out.println("El perimetro del circulo es:"+objCirculo.calcularPerimetro());
       System.out.println("");

     Cuadrado objCuadrado = new Cuadrado( 25);
         System.out.println("El área del cuadrado es: "+objCuadrado.calcularArea());  
         System.out.println("El perimetro del cuadrado es:"+objCuadrado.calcularPerimetro());
         System.out.println("");
         
      Rectangulo objRectangulo = new Rectangulo(8, 12);
        System.out.println("El área del rectángulo es:"+objRectangulo.calcularArea());
        System.out.println("El perimetro del rectángulo es:"+objRectangulo.calcularPerimetro());
        System.out.println("");

        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(58, 62);
        System.out.println("El área del triángulorectángulo es:"+objTrianguloRectangulo.calcularArea());
        System.out.println("El perimetro del triángulorectángulo es:"+objTrianguloRectangulo.calcularPerimetro());
        String tipoTriangulo =  objTrianguloRectangulo.determinarTipoTriangulo();
        System.out.println("El tipo de triangulo que se esta manejado:"+ tipoTriangulo);
                        

    }
}

