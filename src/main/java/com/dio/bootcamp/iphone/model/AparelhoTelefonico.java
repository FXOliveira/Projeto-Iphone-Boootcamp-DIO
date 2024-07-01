package com.dio.bootcamp.iphone.model;

import com.dio.bootcamp.iphone.interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico {
    
    private String numero;

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }

    public AparelhoTelefonico() {
    }

    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.println("Ligando para número:" + this.numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio do voz!!");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
