/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradoscgradosf;

import java.util.Scanner;

/**
 *
 * @author FRANCISCO
 */
public class GradosCGradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese los Grados Centigrados");
        double centigrados = scan.nextDouble();
        double farenheit = centigrados * 1.82 +32;
        System.out.println("Grados Farenheit: "+ farenheit);
        
        
    }
    
}
