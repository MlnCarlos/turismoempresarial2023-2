package org.example.validaciones;

import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {
    Util util = new Util();
    public OfertaValidacion(){

    }
    public Boolean validarTitulo(String titulo)throws Exception{
        if (titulo.length() <= 30){
            return true;
        }else{
            throw new Exception("El titulo de la oferta no puede sobrepasar los 20 caracteres");
        }
    }
    public Boolean validarFormatoFecha(String fechaInicio)throws Exception{
        String expresionRegular = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}$";
        if (util.crearFormato(expresionRegular,fechaInicio)){   //PREGUNTARLE AL PROFESOR COMO HACER PARA COMPARAR QUE LAS FECHAS QUE
            return true;                                                 //HAY QUE VALIDAR SI CUMPLAN EL FORMATO
        }else{
            throw new Exception("El formato de fecha debe de ser DD/MM/YYY");
        }
    }
    public Boolean validarDiferenciaEntreFechas(LocalDate fechaInicio, LocalDate fechaFin)throws Exception{
        if (fechaInicio.isAfter(fechaFin)) {
            throw new Exception("La fecha de inicio no puede ser despues de la fecha fin");
        } else{
            return true;
        }
    }

    public Boolean validarCosto(Double costoPersona)throws Exception{
        if (costoPersona < 0){
            throw new Exception("El costo de la entrada no puede ser negativo");
        }else{
            return true;
        }
    }

}
