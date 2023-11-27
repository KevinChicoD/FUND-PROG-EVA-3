/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_paso_parametros;

/**
 *
 * @author invitado
 */
public class EVA3_6_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println("El valor de x en el main() es de: " + x);
        pasoporvalor(x);
        System.out.println("El valor de x en el main() es de: " + x);
    }
    //en el paso por valor de argumentos, se envia una copia al metodo
    public static void pasoporvalor(int valor){
        System.out.println("El valor que recibo en el metodo es de: " +  valor);
        valor++;
        System.out.println("El valor que recibo en el metodo es de: " +  valor);
    }
}
