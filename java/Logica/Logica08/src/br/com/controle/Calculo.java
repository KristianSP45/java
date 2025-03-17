/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author sousa
 */
public class Calculo {
    private int[] v = new int[3];

    public void setV(int index, int value) {
        if (index >= 0 && index < v.length) {
            v[index] = value;
        }
    }
    
    public int getV(int index) {
        if (index >= 0 && index < v.length) {
            return v[index];
        }
        return -1;
    }
    
    public void ordenarDecrescente() {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] < v[j]) {
                    // Troca os valores
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }
}
