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
public class Telefono {
    //atributos, instanciado objeto
 public botonApagar EA = new botonApagar();
 Tecla[][] Teclado = new Tecla [5][3];
public void setTeclado (){
               int digito = 0;
        Tecla aux1 = new Tecla ();
        aux1.setDigito('0');
       Teclado[3][1] = aux1;
        Tecla aux2 = new Tecla ();
        aux2.setDigito ('*');
        Teclado [3][0] = aux2;
         Tecla aux3 = new Tecla ();
        aux3.setDigito('#');
        Teclado [3][2] = aux3;
                for (int i = 0; i <= 3; i++ ){
             for (int j = 0; j <= 3 ; j++) {
                digito =+
                        character for digit
                 Tecla aux = new Tecla();
                
                 aux.setDigito(digito);
                
            Teclado[i][j]= aux;
            }
             aux.setDigito() += 1;
             
         }
         
     }
     
         
     }
 
    

