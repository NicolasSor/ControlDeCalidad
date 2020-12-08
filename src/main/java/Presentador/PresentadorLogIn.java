/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import MemoriaReglas.Empresa;
import Vista.LogIn;

/**
 *
 * @author chris
 */
public class PresentadorLogIn {
    private LogIn vista;

    public PresentadorLogIn(LogIn vista) {
        this.vista = vista;
    }


    public void Autenticar(String user, String pass) {
        vista.Autenticar(Empresa.buscarUsPas(user,pass));
    }


}
