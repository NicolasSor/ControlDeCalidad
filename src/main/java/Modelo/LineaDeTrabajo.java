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
public class LineaDeTrabajo {
    private int idLinea;
    private OP orden;

    public LineaDeTrabajo(int idLinea, OP orden) {
        this.idLinea = idLinea;
        this.orden = orden;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public OP getOrden() {
        return orden;
    }

    public void setOrden(OP orden) {
        this.orden = orden;
    }
    
}
