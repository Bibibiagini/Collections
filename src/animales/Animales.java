/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import AnimalesEntidades.Animal;
import AnimalesEntidades.Caballo;
import AnimalesEntidades.Gato;
import AnimalesEntidades.Perro;

/**
 *
 * @author Bibi
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal perro = new Perro("Pufli","pavita",5,"York");
    perro.Alimentarse();
    Perro perro1 = new Perro("Polo","molida",7,"Callejero");
    perro1.Alimentarse();
    
    Animal gato = new Gato("Lolo","alimento",3,"Siames");
    gato.Alimentarse();
    Gato gato1 = new Gato("Pocho","pescado",4,"Lion");
    gato1.Alimentarse();
    
    Animal caballo = new Caballo("Sultan","cesped",6,"Fino");
    caballo.Alimentarse();
    
    }
    
    
}
