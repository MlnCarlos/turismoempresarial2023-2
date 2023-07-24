package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Boolean buscarCoincidencia(String expresionRegular, String cadena){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()) {
            return true;
        }
        return  false;
    }
    public Boolean crearFormato(String expresionRegular, String fecha){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidenciaInicio = patron.matcher(fecha);
        if(coincidenciaInicio.matches()) {
            return true;
        }
        return  false;

    }

    public static LocalDate convertirFechaStringLocalDate(String fecha, String formato) {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(formato);
        LocalDate fechaConvertida = LocalDate.parse(fecha, formatoFecha);
        return fechaConvertida;
    }
}

