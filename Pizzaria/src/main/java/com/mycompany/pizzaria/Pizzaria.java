/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzaria;

/**
 *
 * @author marqu
 */
public class Pizzaria {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Rua A, 123");
        Cliente cliente1 = new Cliente("Maria", "Rua B, 456");
        Cliente cliente2 = new Cliente("José", "Rua C, 789");
        
        System.out.println("\nPizzaria Tabajara: Checkout\n");

        Pedido pedido = new Pedido(cliente);
        Comida pizza = new Comida("Pizza", 30.0);
        pedido.adicionarComida(pizza);

        Comida hamburger = new Comida("Hamburger", 20.0);
        pedido.adicionarComida(hamburger);

        Comida batataFrita = new Comida("Batata Frita", 15.0);
        pedido.adicionarComida(batataFrita);
        
        Pedido pedido1 = new Pedido(cliente1);
        Comida hamburger1 = new Comida("Hamburger", 20.0);
        pedido1.adicionarComida(hamburger1);

        Comida batataFrita1 = new Comida("Batata Frita", 15.0);
        pedido1.adicionarComida(batataFrita1);
        
        Pedido pedido2 = new Pedido(cliente2);
        Comida hamburger2 = new Comida("Hamburger", 20.0);
        pedido2.adicionarComida(hamburger2);
        
        Comida pizza2 = new Comida("Pizza", 30.0);
        pedido2.adicionarComida(pizza2);

        

        double valorTotal = pedido.getValorTotal();
        double valorTotal1 = pedido1.getValorTotal();
        double valorTotal2 = pedido2.getValorTotal();

        System.out.println("O valor total do pedido de " + cliente.getNome() + " é R$" + valorTotal);
        System.out.println("O valor total do pedido de " + cliente1.getNome() + " é R$" + valorTotal1);
        System.out.println("O valor total do pedido de " + cliente2.getNome() + " é R$" + valorTotal2);
    }
}

