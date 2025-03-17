/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Scanner;

/*
Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int v = 0;
        
        System.out.print("Digite um número: ");
        v = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(v+" x "+i+" =  "+(v*i));
        }
    }
}
