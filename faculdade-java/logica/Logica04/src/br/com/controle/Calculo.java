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
    private int num;
    private int antes;
    private int depois;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAntes() {
        return getNum()-1;
    }

    public void setAntes(int antes) {
        this.antes = antes;
    }

    public int getDepois() {
        return getNum()+1;
    }

    public void setDepois(int depois) {
        this.depois = depois;
    }
}
