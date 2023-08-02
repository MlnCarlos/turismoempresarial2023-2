package org.example.validaciones;

import org.example.utilidades.Util;

public class AfiliadoValidacion {

    //Valor de la membresia no puede ser menos a $20.000 ni mayor a $150.000
    //La cedula del referido solo puede tener numeros

    Util util = new Util();
    public AfiliadoValidacion() {
    }
    public Boolean validarMembresia(Integer valorMembresia) throws Exception{
        if (valorMembresia >= 20000 || valorMembresia <= 150000) {
            return true;
        }else{
            throw new Exception("Señor usuario el valor de la membresia no puede ser menor a $20.000 ni mayor a $150.000");
        }

    }
    public Boolean validarDocumentoReferido(String documentoReferido) throws Exception{
        String expresionRegular = "^[0-9]+$";
        if (util.buscarCoincidencia(expresionRegular,documentoReferido)){
            return true;
        }else{
            throw new Exception("Señor usuario en el campo (Documento del referido) solo debe de ir numeros");
        }

    }
}
