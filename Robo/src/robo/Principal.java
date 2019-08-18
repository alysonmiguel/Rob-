/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

import java.io.IOException;

/**
 *
 * @author Alyson
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        // TODO code application logic here
        
        TestarRobo teste = new TestarRobo();
        teste.definirAmbiente();
        teste.iniciarRobo();
        teste.menu();
        
        
        
    }
    
}
