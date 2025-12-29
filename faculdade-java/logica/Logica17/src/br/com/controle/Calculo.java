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
    private float fahr;
    private float fahrparacels;

    public float getFahr() {
        return fahr;
    }

    public void setFahr(float fahr) {
        this.fahr = fahr;
    }

    public float getFahrparacels() {
        return (5 * (getFahr() - 32)) / 9;
    }

    public void setFahrparacels(float fahrparacels) {
        this.fahrparacels = fahrparacels;
    }
}
