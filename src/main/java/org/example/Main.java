package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Enter your code here

        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();

        System.out.println("***Bienvenido***");
        System.out.println("1. Recogiendo datos del usuario: ");
        System.out.println("Ingrese el numero de documento");
        usuario.setDocumento(teclado.nextLine());
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());
        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());
        System.out.println("Ingrese la ubicacion de residencia (1-4)(zona centro, sur, norte y otras): ");
        usuario.setUbicacion(teclado.nextInt());

        System.out.println("2. Datos del Local");
        System.out.println("Ingrese el numero de NIT del local:");
        local.setNit(teclado.nextLine());
        System.out.println("Ingrese el nombre del local:");
        local.setNombre(teclado.nextLine());
        System.out.println("Ingrese la ubicacion del local (1-4)(zona centro, sur, norte y otras): ");
        local.setUbicacion(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingresa una descripcion amplia y detallada acerca del local y sus prestaciones:");
        local.setDescripcion(teclado.nextLine());

        System.out.println("3. Datos de la Oferta");
        System.out.println("Ingresa el titulo de la oferta:");
        oferta.setTitulo(teclado.nextLine());
        System.out.println("Ingresa una descripcion detallada acerca de la oferta:");
        oferta.setDescripcion(teclado.nextLine());
        System.out.println("Ingrese la fecha inicio de la oferta:");
        oferta.setFechaInicio(teclado.nextLine());
        System.out.println("Ingrese la fecha fin de la oferta:");
        oferta.setFechaFin(teclado.nextLine());
        System.out.println("Ingrese el valor que tiene la oferta por persona:");
        oferta.setCostoPersona(teclado.nextDouble());
        System.out.println("IdLocal:");
        oferta.setIdLocal(teclado.nextInt());

        System.out.println("4. Datos de la Reserva");
        System.out.println("Id:");
        reserva.setId(teclado.nextInt());
        System.out.println("IdUsuario:");
        reserva.setIdUsuario(teclado.nextInt());
        System.out.println("IdOferta:");
        reserva.setIdOferta(teclado.nextInt());
        System.out.println("Cual es el costo total de la reserva:");
        reserva.setCostoTotal(teclado.nextDouble());
        teclado.nextLine();
        System.out.println("Cual es la fecha de reserva:");
        reserva.setFechaReserva(teclado.nextLine());
        System.out.println("Cual es el numero de personas en la reserva:");
        reserva.setNumeroReserva(teclado.nextInt());



















    }


}