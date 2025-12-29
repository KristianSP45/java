/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Random;
/*
Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        Random random = new Random();
        
        int sorteio;
        
        sorteio=random.nextInt(100)+1;
        
        System.out.println("O número aleatório é: "+sorteio);
    }
}
