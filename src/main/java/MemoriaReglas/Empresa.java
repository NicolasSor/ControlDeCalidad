/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaReglas;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Empresa {
    
    private static ArrayList<Empleado> emp;
    private static ArrayList<Color> col;
    private static ArrayList<OP> orPo;
    private static ArrayList<Modelo> mod;
    private static ArrayList<Turno> tur;
    private static ArrayList<LineaDeTrabajo> lin;

//Getters
    public static ArrayList<Empleado> getEmp() {
        return emp;
    }

    public static ArrayList<Color> getCol() {
        return col;
    }

    public static ArrayList<OP> getOrPo() {
        return orPo;
    }

    public static ArrayList<Modelo> getMod() {
        return mod;
    }

    public static ArrayList<Turno> getTur() {
        return tur;
    }

    public static ArrayList<LineaDeTrabajo> getLin() {
        return lin;
    }
    
    
    
//LogIn  
    public static boolean buscarUsPas(String user, String pass)
    {
        for (Empleado e: emp)  
            {
            if(e.getUsuario().equals(user) && e.getContraseña().equals(pass))
        return true;
            }
        return false;
    }


//Gestion de Color
    public static void AgregarColor(int codigo, String descripcion) 
    {
        Color c =new Color(codigo,descripcion);
        col.add(c);
    }

    public static boolean chequearCodigoColor(int codigo) 
    {
        for (Color c: col)
        {
            if(c.getCodigoCol()== codigo)
                return true;
        }
        return false;
    }

    public static boolean chequearDescripcionColor(String descripcion) 
    {
        for (Color c: col)
        {
            if(c.getDescripcionCol().equals(descripcion))
                return true;
        }
        return false;
    }

    public static void modificarDescripcionColor(Color color)
    {
        for (Color c: col)
        {
         if (c.getCodigoCol()== color.getCodigoCol())
         {
         c.setDescripcionCol(color.getDescripcionCol());
         break;
         }
        }
    }
    public static void borrarColor(Color color) {
        for (Color c: col)
        {
            int i = col.indexOf(c);
            if(color.getCodigoCol() == c.getCodigoCol())
            {
            col.remove(i);
            break;
            }
        }
        
    }
    
    
    //Gestion de Modelo

    public static boolean chequearCodigoModelo(int SKU) {
        for (Modelo m: mod)
        {
            if(m.getSKU()== SKU)
                return true;
        }
        return false;
    }

    public static void agregarModelo(Modelo modelo) 
    {
        mod.add(modelo);
    }

    public static Modelo buscarModelo(int SKU) {
        for (Modelo m : mod)
        {
            if(m.getSKU() == SKU)
                return m;
        }
        return null;
    }
    
    public static void borrarModelo(int SKUU) {
         for (Modelo m: mod)
        {
            int i = mod.indexOf(m);
            if(SKUU == m.getSKU())
            {
            mod.remove(i);
            break;
            }
        }
    }
    
    //Inicializacion
    
    public static void inicializar()
    {
        emp = new ArrayList();
        col = new ArrayList();
        lin = new ArrayList();
        mod = new ArrayList();
        tur = new ArrayList();
        
        generarEmpleado();
        generarColoresYModelos();
        generarLineasDeTrabajo();
        generarTurnos();
    
    }

    private static void generarEmpleado() 
    {
        emp.add(new Empleado ("Juan","Perez","NoAprueboMas@Lloro.com","juani","123","Administrativo"));
        emp.add(new Empleado ("Jorge","Lopez","TalVezLoHaga@NoLloro.com","jorgito","123","SupervisorCalidad"));
        emp.add(new Empleado ("Luis","Manzur","AQuienEngaño@LloroMas.com","luisito","123","SupervisorLinea"));
    }

    private static void generarColoresYModelos() {
        Color c1 = new Color(1,"rojo");
        Color c2 = new Color(2,"azul");
        Color c3 = new Color(3,"verde");
        Color c4 = new Color(4,"morado");
        Color c5 = new Color(5,"rosa");
        Color c6 = new Color(6,"negro");
        Color c7 = new Color(7,"blanco");
        col.add(c1);
        col.add(c2);
        col.add(c3);
        col.add(c4);
        col.add(c5);
        col.add(c6);
        col.add(c7);
        
    }

    private static void generarLineasDeTrabajo() {
    
    }

  

    private static void generarTurnos() {
    
    }

    
    }