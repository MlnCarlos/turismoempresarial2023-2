package org.example.validaciones;

import org.example.utilidades.Mensajes;

public class ClienteNoAfialiadoValidaciones {
    public ClienteNoAfialiadoValidaciones() {
    }
    public Boolean validarNumeroReservas(Integer numeroReservas) throws Exception{
        if (numeroReservas >= 5){
            System.out.println(Mensajes.DESCUENTO.getMensaje());
            return true;
        } else if (numeroReservas < 0) {
            throw new Exception("El numero de reservas no puede ser negativo");
        }else{
            return true;

        }
    }
}
