/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.*;

/**
 *
 * @author chris
 */
public interface IGestionarColor {
    void ActualizarTabla();
    void mostrarMensajeDescripcion();
    void mostrarMensajeAgregado();
    void mostrarMensajeErrorFila();
    void mostrarMensajeModificacion();
    void mostrarMensajeBorrado();
}
