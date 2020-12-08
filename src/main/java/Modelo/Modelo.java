/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Modelo {
    private int SKU;
    private String descripcionMod;
    private int objetivo;
    private ArrayList<Color> col;

    public Modelo(int SKU, String descripcionMod, int objetivo, ArrayList<Color> col) {
        this.SKU = SKU;
        this.descripcionMod = descripcionMod;
        this.objetivo = objetivo;
        this.col = col;
    }

  

 

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public String getDescripcionMod() {
        return descripcionMod;
    }

    public void setDescripcionMod(String descripcionMod) {
        this.descripcionMod = descripcionMod;
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    public ArrayList<Color> getCol() {
        return col;
    }

    public void setCol(ArrayList<Color> col) {
        this.col = col;
    }

    public int generarCodigo() {
         return (int) (Math.random() * 100);
    }

    
    
}
