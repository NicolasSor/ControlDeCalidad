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
public class Defecto {
    private int idDefecto;
    private String descDefecto;

    public Defecto(int idDefecto, String descDefecto) {
        this.idDefecto = idDefecto;
        this.descDefecto = descDefecto;
    }

    public int getIdDefecto() {
        return idDefecto;
    }

    public void setIdDefecto(int idDefecto) {
        this.idDefecto = idDefecto;
    }

    public String getDescDefecto() {
        return descDefecto;
    }

    public void setDescDefecto(String descDefecto) {
        this.descDefecto = descDefecto;
    }
    
}
