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
public class Rectagulo extends Poligono{
    private int lado1;
    private int lado2;

    public Rectagulo(int lado1, int lado2) {
        //Decimos que tenemos dos lados
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectagulo"+super.toString() + "lado1 : " + lado1 + " lado2 : " + lado2;
    }
    
    @Override
    public double area(){
        return lado1*lado2; 
    }

  
    
    
    
    
    
}
