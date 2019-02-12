/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

/**
 *
 * @author Daniel
 */import java.util.Scanner;
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius of cone:");
                    double r=s.nextDouble();
        System.out.println("Enter the height of cone:");
                    double h=s.nextDouble();
       
                    double  volume=(22*r*r*h)/(3*7); 
        System.out.println("Volume of Cone is:" +volume); // TODO code application logic here
    }
    
}
