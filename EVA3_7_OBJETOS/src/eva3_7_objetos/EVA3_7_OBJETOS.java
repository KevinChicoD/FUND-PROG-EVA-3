/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona();
        System.out.println(perso1);
        perso1.nombre = "Kevin";
        perso1.apellido = "Chico";
        perso1.edad = 18;
        imprimirPersonas(perso1);

        
        persona perso2 = new persona();
        System.out.println(perso2);
        perso2.nombre = "Ana";
        perso2.apellido = "Martinez";
        perso2.edad = 18;   
        imprimirPersonas(perso2);
    }
    public static void imprimirPersonas(persona perso){
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
        
    }
}

//definen una plantilla para crear objetos
//crear un nuevo tipo de dato
class persona{
    String nombre;
    String apellido;
    int edad;
    
}
