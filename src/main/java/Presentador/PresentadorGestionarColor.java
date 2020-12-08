/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import MemoriaReglas.Empresa;
import Modelo.*;
import Vista.GestionarColor;

/**
 *
 * @author chris
 */
public class PresentadorGestionarColor {
    private GestionarColor vista;
    private Color colo;
    public PresentadorGestionarColor(GestionarColor vista) {
        this.vista = vista;
    }

    public void Agregar(Color col) {
        
        int codigo;
        codigo =  col.generarCodigo();
        boolean b = false;
        
        do
        {
            b = Empresa.chequearCodigoColor(codigo);
            if (b==true)
                codigo = col.generarCodigo();
        }while (b==true);
        
        boolean d = Empresa.chequearDescripcionColor(col.getDescripcionCol());
        
        if(b==false && d==false)
            {
                Empresa.AgregarColor(codigo,col.getDescripcionCol());
                vista.mostrarMensajeAgregado();
                vista.ActualizarTabla();
            }
            else
                vista.mostrarMensajeDescripcion();
    }

    public void modificarDescripcion(Color color) {
        Empresa.modificarDescripcionColor(color); 
        vista.mostrarMensajeModificacion();
        vista.ActualizarTabla();
    }

    public void borrarColor(Color color) {
        Empresa.borrarColor(color);
        vista.mostrarMensajeBorrado();
        vista.ActualizarTabla();       
    }
    
   
}
