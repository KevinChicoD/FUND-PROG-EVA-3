/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_funciones;

/**
 *
 * @author invitado 
 */
public class EVA3_1_FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a funcion o procedimiento
        imprimirMensaje("Hola mundo plebes!!!", 20);
        
    }
    
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
        System.out.println(mensaje);
    }                                   
    }
    
}
