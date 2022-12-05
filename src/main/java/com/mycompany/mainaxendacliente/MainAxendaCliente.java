/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mainaxendacliente;

import java.util.Scanner;

/**
 *
 * @author a22davidrl
 */
public class MainAxendaCliente {

    public static void main(String[] args) {
        AxendaTelefonica axenda = new AxendaTelefonica();

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nif");
        String nif1 = leer.nextLine();
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre1 = leer1.nextLine();
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Introduce los apellidos");
        String apellidos1 = leer2.nextLine();

        Scanner leer14 = new Scanner(System.in);
        System.out.println("Introduce el numero del cliente");
        int telefono = leer14.nextInt();

        Cliente cli = new Cliente(nif1, nombre1, apellidos1);

        axenda.inserir(telefono, cli);

        Scanner leerel = new Scanner(System.in);
        System.out.println("Introduce el numero del cliente a eliminar");
        int tele = leerel.nextInt();

        axenda.eliminar(tele);

        Scanner leer17 = new Scanner(System.in);
        System.out.println("Introduce el numero del cliente que quieres buscar");
        int teleAN = leer17.nextInt();

        axenda.buscarPorTelefono(teleAN);

        System.out.println("el cliente es " + axenda.getAxenda().get(teleAN).getNombre() + " " + axenda.getAxenda().get(teleAN).getApellidos());
        axenda.numeroContactos();

    }
}
