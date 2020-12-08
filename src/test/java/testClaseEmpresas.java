/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MemoriaReglas.Empresa;
import Modelo.Color;
import Modelo.Empleado;
import Modelo.Modelo;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author chris
 */
public class testClaseEmpresas extends TestCase {
    
    public testClaseEmpresas(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    public void testEmpresaBuscarUsCon()    
    {
        //Arrange
        Empresa.inicializar();
        Empleado e = new Empleado("Juan","Perez","NoAprueboMas@Lloro.com","juani","123","Administrativo");
        
        //Act
        boolean b = Empresa.buscarUsPas(e.getUsuario(), e.getContraseña());
        
        //Assert
        assertEquals(true, b);
    }
    
       public void testEmpresaModifColor()    
    {
        //Arrange
        Empresa.inicializar();
        Color c = new Color(5,"Naranja");
        
        
        //Act
        Empresa.modificarDescripcionColor(c);
        boolean b = false;
        for(Color col: Empresa.getCol())
        {
            if (col.getDescripcionCol().equals(c.getDescripcionCol()) && col.getCodigoCol()==c.getCodigoCol() )
            {
            b = true;
            break;
            }
        }
        
        //Assert
        assertEquals(true, b);
    }
       public void testEmpresaAgregarModelo()    
    {
        //Arrange
        Empresa.inicializar();
        ArrayList<Color> color = new ArrayList<Color>();
        Color c = new Color(1,"Rojo");
        Color c2 = new Color(2,"Azul");
        color.add(c);
        color.add(c2);
        Modelo mod = new Modelo(1,"Zapa",4,color);
        
        //Act
        Empresa.agregarModelo(mod);
        boolean b = false;
        for(Modelo mode: Empresa.getMod())
        {
            if (mode.equals(mod) )
            {
            b = true;
            break;
            }
        }
        
        //Assert
        assertEquals(true, b);
    }
}
