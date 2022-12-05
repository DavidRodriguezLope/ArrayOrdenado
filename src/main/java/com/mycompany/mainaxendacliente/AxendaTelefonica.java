/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaxendacliente;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author a22davidrl
 */
public class AxendaTelefonica {

    HashMap<Integer, Cliente> axenda = new HashMap<Integer, Cliente>();

    public AxendaTelefonica() {

    }

    public HashMap<Integer, Cliente> getAxenda() {
        return axenda;
    }

    public void setAxenda(HashMap<Integer, Cliente> axenda) {
        this.axenda = axenda;
    }

    public void inserir(int tel, Cliente cli) {
        
        axenda.put(tel, cli);
    }

    public void eliminar(int tel) {
        
        axenda.remove(tel);

    }

    public Cliente buscarPorTelefono(int tel) {

        return axenda.get(tel);
    }

    public int numeroContactos() {
        System.out.println("Hay " + axenda.size() + " contactos");

        return axenda.size();
    }

}
