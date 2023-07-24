package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util = new Util();
    public LocalValidacion() {
    }

    public Boolean validarNit(String nit) throws Exception{
        if (nit.length() == 10){
            return true;
        }else{
            throw new Exception(" NIT debe de contener 10 caracteres");
        }
    }

    public Boolean validarNombreLocal(String nombre)throws Exception{
        if (nombre.length() > 30) {
            throw new Exception("El nombre de la empresa no puede sobrepasar los 30 caracteres");
        } else {
            return true;
        }
    }
    public Boolean validarUbicacion(Integer ubicacion)throws Exception{
        if (ubicacion == 1 || ubicacion == 2 || ubicacion == 3 || ubicacion == 4){
            return true;
        }else {
            throw new Exception("La zona ingresada no es valida");
        }
    }
}
