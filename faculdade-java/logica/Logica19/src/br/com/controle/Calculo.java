/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;
/*
Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i+" x "+j+" = "+(i*j)+"   ");
            }
            System.out.println("  ");
        }
    }
}
