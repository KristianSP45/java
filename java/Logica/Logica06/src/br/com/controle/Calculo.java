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
    private double num;
    private double total;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getTotal() {
        return (getNum()*0.05)+getNum();
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
