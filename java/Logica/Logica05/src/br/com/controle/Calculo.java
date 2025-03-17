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
    private double sm=1293.20;
    private double su;
    private double total;

    public double getSm() {
        return sm;
    }

    public void setSm(double sm) {
        this.sm = sm;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getTotal() {
        return getSu()/getSm();
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
