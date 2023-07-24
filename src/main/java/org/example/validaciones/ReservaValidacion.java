package org.example.validaciones;

import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaValidacion {
    Util util = new Util();
    public ReservaValidacion() {
    }
    public Boolean validarFechaReserva(String fechaReserva)throws Exception{
        String expresionRegular = "\\d{2}/\\d{2}/\\d{4}";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidenciaInicio = patron.matcher(fechaReserva);
        if (coincidenciaInicio.matches()){
            return true;
        }else{
            throw new Exception("El formato de fecha debe de ser DD/MM/YYY");
        }
    }
    public Boolean validarNumeroReserva(Integer numeroReserva)throws Exception{
        if (numeroReserva <= 4 && numeroReserva > 0){
            return true;
        }else{
            throw new Exception("La cantidad maxima por reserva es de 4 personas");
        }
    }
}
