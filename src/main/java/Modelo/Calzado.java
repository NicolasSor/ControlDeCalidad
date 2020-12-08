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
public class Calzado {
    private int numero;
    private TipoPar tipoPar;
    private TipoDefecto tipoDef;

    public Calzado(int numero, TipoPar tipoPar, TipoDefecto tipoDef) {
        this.numero = numero;
        this.tipoPar = tipoPar;
        this.tipoDef = tipoDef;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoPar getTipoPar() {
        return tipoPar;
    }

    public void setTipoPar(TipoPar tipoPar) {
        this.tipoPar = tipoPar;
    }

    public TipoDefecto getTipoDef() {
        return tipoDef;
    }

    public void setTipoDef(TipoDefecto tipoDef) {
        this.tipoDef = tipoDef;
    }
    
}
