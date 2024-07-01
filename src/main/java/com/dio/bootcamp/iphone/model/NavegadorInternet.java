package com.dio.bootcamp.iphone.model;

import com.dio.bootcamp.iphone.interfaces.INavegadorInternet;

public class NavegadorInternet implements INavegadorInternet {
    
    private String campoUrl;

    public NavegadorInternet(String campoUrl) {
        this.campoUrl = campoUrl;
    }

    public NavegadorInternet() {
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }

    public String getCampoUrl() {
        return campoUrl;
    }

    public void setCampoUrl(String campoUrl) {
        this.campoUrl = campoUrl;
    }

}
