package Model;

/**
 * Esta clase define objetos de tipo triángulo Rectángulo con una 
 * base y una altura como atributos.
 * 
 * @version 1.4/2023
 */
public class TrianguloRectangulo {
   int base; // Atributo que define la base de un triángulo rectángulo
   int altura;  // Atributo que define la altura de un triángulo rectángulo

   /**
    * Contructor de la clase TriánguloRectángulo
    * 
    * @param base Parámetro que define la base de un triángulo 
    *             rectángulo
    * @param altura Parámetro que define la altura de un triángulo
    *               rectángulo 
    */
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devulve el área de un triángulo rectángulo 
     * como base multiplicada por la altura sobre 2 
     * 
     * @return Área de un triángulo rectángulo  
     */
    public double calcularArea() {
        return (base * altura / 2);
    }

    /**
     * Método que calcula y devuelve el perimetro de un triángulo 
     * rectángulo como la suma de la base, altura y la hiptotenusa 
     * 
     * @return Perímetro de un triángulo rectángulo 
     */
    public double calcularPerimetro() {
        return (base + altura + calcularaHipotenusa()); /**Invoca al método calcular hipotenusa */
    }

    /**
     * Método que calcula y devuelve la hipotenusa de un triángulo 
     * rectángulo utilizando el teorema de Pitágoras 
     * 
     * @return Hipotenusa de un triángulo rectángulo 
     */
    double calcularaHipotenusa(){
        return Math.pow(base * base + altura  * altura, 0.5);
    }
/**
* Método que determina si un triangulo es:
*-Equilatero: Si sus tres lados son iguales
*-Escaleno : Si sus tres lados son todos diferentes
*-Isóseles  Si dos de sus lados son iguales y el otro es diferente de los demás  
*/  
    public String determinarTipoTriangulo() {
         String tipo = "";
         if((base == altura) && (base == calcularaHipotenusa()) && (altura == calcularaHipotenusa())){
            tipo=("Es un triángulo equilatero"); /**Todos sus lados son iguales */
                
        } else if ((base != altura) && (base != calcularaHipotenusa()) && (altura != calcularaHipotenusa())){
            tipo=("Es un triángulo escaleno"); /** Todos sus lados son diferentes  */
        } else{
           tipo=("Es un triángulo isóseles "); /** De otra manera, es isóseles */
        }

        return tipo;             
    }
 
}
