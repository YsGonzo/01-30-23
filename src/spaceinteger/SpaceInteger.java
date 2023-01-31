/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinteger;
import java.util.Scanner;
/**
 *
 * @author Jayson Gonzalez
 */
public class SpaceInteger {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a 5 digit integer: ");
        int myint = keyboard.nextInt();

        /* Seperates last number from given number */
        if((myint >=10000) && (myint <=99999)) {
            System.out.printf("%d ", (myint / 10000));
            System.out.printf("%d ", (myint / 1000) % 10);
            System.out.printf("%d ", (myint / 100) % 10);
            System.out.printf("%d ", (myint % 100) / 10);
            System.out.printf("%d ", (myint % 10));
        }
        else {
            System.out.print("Please make sure your input is 5 digits.");
        }
    }
}