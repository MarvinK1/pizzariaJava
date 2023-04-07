/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzaria;
import java.util.ArrayList;

/**
 *
 * @author marqu
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Comida> comidas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.comidas = new ArrayList<>();
    }

    public void adicionarComida(Comida comida) {
        this.comidas.add(comida);
        this.cliente.adicionarComida(comida);
    }

    public double getValorTotal() {
        return cliente.calcularPedido();
    }
}
