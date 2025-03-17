/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Scanner;
/*
Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: 
valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. 
Imprima na tela o salário líquido final.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ha, na, inss;
        
        System.out.print("Digite o valor da hora aula: ");
        ha=scanner.nextInt();
        
        System.out.print("Digite o número de aulas no mês: ");
        na=scanner.nextInt();
        
        System.out.print("Digite o desconto do INSS: ");
        inss=scanner.nextInt();
        
        System.out.println("Salário Bruto: "+(ha*na));
        System.out.println("");
    }
}
