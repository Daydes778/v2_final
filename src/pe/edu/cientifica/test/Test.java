/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.cientifica.test;

import com.google.gson.Gson;
import pe.edu.cientifica.config.Conexion;
import pe.edu.cientifica.daoImp.AlumnoDaoImp;
import pe.edu.cientifica.daoImp.CarreraDaoImp;

/**
 *
 * @author José
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gson gson= new Gson(); 
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
        AlumnoDaoImp impl = new AlumnoDaoImp();
        if(impl.validar("kevin", "123")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        CarreraDaoImp cdi =  new CarreraDaoImp();
        //System.out.println(cdi.create(new Carrera(0,"Enfermeria")));
        System.out.println(cdi.update(new idcarrera(5,"Nutricion")));
        //System.out.println(cdi.delete(1));
        //System.out.println(gson.toJson(cdi.read(4)));
        //
    }
}
