/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_uno;

/**
 *
 * @author Alexander
 */
public class Triangulo extends Poligono{
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo "+super.toString()+" lado1 : "+lado1+"lado2 : "+lado2+"lado3 : "+lado3;
    }

    @Override
    public double area() {
        return lado1*lado2*lado3;
    }

  
    
    
    
    
    
}
