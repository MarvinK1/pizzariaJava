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

public class Cliente {
    private String nome;
    private String endereco;
    private ArrayList<Comida> comidas;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.comidas = new ArrayList<>();
    }

    public void adicionarComida(Comida comida) {
        this.comidas.add(comida);
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public double calcularPedido() {
        double valorTotal = 0.0;
        for (Comida comida : comidas) {
            valorTotal += comida.getPreco();
        }
        return valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}



