/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author chris
 */
public class Color {
    private int codigoCol;
    private String descripcionCol;

    public Color(int codigoCol, String descripcionCol) {
        this.codigoCol = codigoCol;
        this.descripcionCol = descripcionCol;
    }

    public int getCodigoCol() {
        return codigoCol;
    }

    public void setCodigoCol(int codigoCol) {
        this.codigoCol = codigoCol;
    }

    public String getDescripcionCol() {
        return descripcionCol;
    }

    public void setDescripcionCol(String descripcionCol) {
        this.descripcionCol = descripcionCol;
    }

    public int generarCodigo() 
    {
    return  (int) (Math.random() * 20);
    }
    
    
        }    

