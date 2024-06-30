package com.dio.bootcamp.iphone.model;

import com.dio.bootcamp.iphone.interfaces.IAparelhoEletrônico;

public abstract class AparelhoEletrônico implements IAparelhoEletrônico {

   protected boolean isLigado;
   protected boolean flagAtender;
   protected boolean flagIniciarCorreioVoz;

   public AparelhoEletrônico(boolean isLigado, boolean flagAtender, boolean flagIniciarCorreioVoz) {
       this.isLigado = isLigado;
       this.flagAtender = flagAtender;
       this.flagIniciarCorreioVoz = flagIniciarCorreioVoz;
    }

   public AparelhoEletrônico() {
    }

    @Override
    public abstract void ligar();
    @Override
    public abstract void desligar();
    @Override
    public abstract void iniciarCorreioVoz();
    @Override
    public abstract void alterarVolume();
    @Override
    public abstract void atender();

}

