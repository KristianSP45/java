/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Scanner;
/*
Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        
        System.out.print("Digite o valor A: ");
        a=scanner.nextInt();
        
        System.out.print("Digite o valor B: ");
        b=scanner.nextInt();
        
        int quociente=a/b;
        int resto=a%b;
        
        System.out.println("O quociente é: "+quociente);
        System.out.println("O resto é: "+resto);
    }
}
