package com.dio.bootcamp.iphone.model;

import com.dio.bootcamp.iphone.interfaces.IReprodutorMusical;

import java.util.List;

public class ReprodutorMusical implements IReprodutorMusical {
    
    private boolean isTocando;
    private List<String> listaMusicasDefault;

    public ReprodutorMusical(boolean isTocando, List<String> listaMusicasDefault) {
        this.isTocando = isTocando;
        this.listaMusicasDefault = listaMusicasDefault;
    }

    public ReprodutorMusical(boolean isTocando) {
        this.isTocando = isTocando;
    }

    public ReprodutorMusical(List<String> listaMusicasDefault) {
        this.listaMusicasDefault = listaMusicasDefault;
    }

    public ReprodutorMusical() {
    }

    @Override
    public void tocar() {
        if (this.isTocando() == false) {
            System.out.println("Iniciando Reprodução de música!!");
            this.setTocando(true);
        } else {
            System.out.println("Música já está tocando!!");
        }
    }

    @Override
    public void pausar() {
        if (this.isTocando() == true) {
            System.out.println("Pausando a música!!");
            this.setTocando(false);
        } else {
            System.out.println("Atenção! O reprodutor já não está tocando a música!!");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música:" + musica);
    }

    public boolean isTocando() {
        return isTocando;
    }

    public void setTocando(boolean tocando) {
        isTocando = tocando;
    }

    public List<String> getListaMusicasDefault() {
        return listaMusicasDefault;
    }

    public void setListaMusicasDefault(List<String> listaMusicasDefault) {
        this.listaMusicasDefault = listaMusicasDefault;
    }
}
