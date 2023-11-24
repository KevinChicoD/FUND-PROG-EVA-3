/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_factorial;


/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("factorial de 5 = " + calcularFactorial(valor));
        
        //crear METODO calcularPotencia(int base, int potencia) --> regresa entero
        System.out.println("su potencia = " + calcularPotencia(9, 4));
    }
    
     
    public static int calcularFactorial(int valor){
        
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
           guardar *= i; //guardar = guardar * i;
        }
        return guardar;
    }
    public static int calcularPotencia(int base, int potencia){
        int respue = 1;
        for (int i = 1; i <= potencia; i++) {
            respue = (respue * base);
        }
        return respue;
    }
}
