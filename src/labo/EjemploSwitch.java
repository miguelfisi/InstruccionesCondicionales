/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        do {
            //ingreso de entero como cadena
            System.out.println("Ingrese Entero:");
            String num = scanner.nextLine();
            //scanner.close();
            //convertir
            
             x=Integer.valueOf(num).intValue();

            switch (x) {

                case 0:
                    System.out.println("domingo");
                    break;
                case 1:
                    System.out.println("lunes");
                    break;
                case 2:
                    System.out.println("martes");
                    break;
                case 3:
                    System.out.println("miercoles");
                    break;
                default:
                    System.out.println("Valor incorrecto!!");
            }

        } while (x != 0 && x!=1 && x!=2 && x!=3);
         System.out.println("***Ha ingresado un valor correcto!! - GRacias***");
        //haciendo comparaciones
        /*
        switch (x) {

            case 0:
                System.out.println("domingo");
                break;
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            default:
                System.out.println("Valor incorrecto");
        }
         */
      
        
    }
}
