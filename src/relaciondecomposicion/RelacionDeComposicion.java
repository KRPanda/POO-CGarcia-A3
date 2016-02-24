/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciondecomposicion;

/**
 *
 * @author carlos
 */
public class RelacionDeComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono starTac = new Telefono();
        starTac.EA.presionar();
        System.out.println("el starTac esta" + starTac.EA.IO);
        starTac.Teclado[4][3].getDigito();
    }
    
}
