/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angelica
 */
public class DetalleGrupo {
    private double examenTeorico1;
    private double examenTeorico2;
    private double examenPractico1;
    private double examenPractico2;
    private double examenPractico3;
    private double examenFinalPractico;
    private double promedio;

    public DetalleGrupo() {
    }

    public DetalleGrupo(double examenTeorico1, double examenTeorico2, double examenPractico1, double examenPractico2, double examenPractico3, double examenFinalPractico, double promedio) {
        this.examenTeorico1 = examenTeorico1;
        this.examenTeorico2 = examenTeorico2;
        this.examenPractico1 = examenPractico1;
        this.examenPractico2 = examenPractico2;
        this.examenPractico3 = examenPractico3;
        this.examenFinalPractico = examenFinalPractico;
        this.promedio = promedio;
    }

    public double getExamenTeorico1() {
        return examenTeorico1;
    }

    public void setExamenTeorico1(double examenTeorico1) {
        this.examenTeorico1 = examenTeorico1;
    }

    public double getExamenTeorico2() {
        return examenTeorico2;
    }

    public void setExamenTeorico2(double examenTeorico2) {
        this.examenTeorico2 = examenTeorico2;
    }

    public double getExamenPractico1() {
        return examenPractico1;
    }

    public void setExamenPractico1(double examenPractico1) {
        this.examenPractico1 = examenPractico1;
    }

    public double getExamenPractico2() {
        return examenPractico2;
    }

    public void setExamenPractico2(double examenPractico2) {
        this.examenPractico2 = examenPractico2;
    }

    public double getExamenPractico3() {
        return examenPractico3;
    }

    public void setExamenPractico3(double examenPractico3) {
        this.examenPractico3 = examenPractico3;
    }

    public double getExamenFinalPractico() {
        return examenFinalPractico;
    }

    public void setExamenFinalPractico(double examenFinalPractico) {
        this.examenFinalPractico = examenFinalPractico;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
