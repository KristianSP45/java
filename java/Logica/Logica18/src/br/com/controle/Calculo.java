/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;
/*
Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. 
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
*/
/**
 *
 * @author sousa
 */
public class Calculo {
    public static void main(String[] args) {
        double altFrancisco=1.50;
        double altSara=1.10;
        int ano=0;
        
        while (altSara<=altFrancisco) {            
           altFrancisco+=0.02;
           altSara+=0.03;
           ano++;
        }
        System.out.println("É preciso de "+ano+" anos para Sara ser maior que Francisco");
    }
}
