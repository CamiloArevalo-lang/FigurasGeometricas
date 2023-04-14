package Model;

/**
 * Esta clase define objetos de tipo Rectángulo con una base y una 
 * altura como atributos.
 * 
 * @version 1.3/2023
 */
public class Rectangulo {
    private int base; // Atributo que define la base de un rectángulo  
    private int altura; // Atributo que define la altura de un rectángulo 

    /**
     * Constructor de la clase Rectangulo
     * 
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo 
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la 
     * multiplicación de la base por la altura 
     * 
     * @return Área de un rectángulo 
     */
    public double calcularArea() {
        return base * altura; 
    }

    /**
     * Método que calcula y devuelve el perímetro de un rectángulo 
     * como (2 * base) + (2 * altura)
     * 
     * @return Perímetro de un rectángulo 
     */
    public double calcularPerimetro() {
         return (2 * base) * (2 * altura);
    }
    
}
