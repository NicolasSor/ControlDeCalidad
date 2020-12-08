/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import MemoriaReglas.Empresa;
import Modelo.Modelo;
import Vista.*;

/**
 *
 * @author chris
 */
public class PresentadorGestionarModelos {
    private GestionarModeloModifBaja modifbaj;
    private GestionarModeloAlta modAlt;
    private GestionarModeloModif modif;

    public PresentadorGestionarModelos(GestionarModeloAlta modAlt) {
        this.modAlt = modAlt;
    }

    public PresentadorGestionarModelos(GestionarModeloModifBaja modifbaj) {
        this.modifbaj = modifbaj;
    }

    public PresentadorGestionarModelos(GestionarModeloModif modif) {
        this.modif = modif;
    }
    
   

    public void agregarModelo(Modelo modelo) {
        int SKUU = modelo.generarCodigo();        
        boolean b = false;
        
        do
        {
            b = Empresa.chequearCodigoModelo(SKUU);
            if (b==true)
                SKUU = modelo.generarCodigo();
        }while (b==true);
        modelo.setSKU(SKUU);
        Empresa.agregarModelo(modelo);
        modAlt.mostrarMensajeAlta();
        modAlt.dispose();
        
        
    }

    public Modelo BuscarModelo(int SKU) {
       return Empresa.buscarModelo(SKU);
    }

    public void borrarModelo(int i) {
        Empresa.borrarModelo(i);
        modifbaj.mostrarMensajeBorrado();
        modifbaj.inicializarTabla();  
    }

    public void modificarModelo(Modelo mod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
