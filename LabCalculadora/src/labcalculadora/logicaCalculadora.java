/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcalculadora;

/**
 *
 * @author Juan Rivera
 */
public class logicaCalculadora {
    public double operacionSuma(double num1, double num2){
        return num1+num2;
    }
    
    //metodo de resta
    public double operacionResta(double num1, double num2){
        return num1-num2;
    }
    //metodo de multiplicacion
    public double operacionMultiplicacion(double num1, double num2){
        return num1*num2;
    }
    //metodo de división
    public double operacionDiv(double num1, double num2){
        return num1/num2;
    }
    //metodo de sen
    public double operacionSeno(double num1){
        return Math.sin(num1);
    }
    //metodo de cos
    public double operacionCos(double num1){
        return Math.cos(num1);
    }
}
