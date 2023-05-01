package com.company;

public class Ave extends Animal{
    private String tipoBico;
    private String som;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipoBico, String som){
        super(nome, idade, especie, alimentado);
        this.som = som;
    }

    public String getTipoBico(){
        return tipoBico;
    }

    public void setTipoBico(String tipoBico){
        this.tipoBico = tipoBico;
    }

    @Override
    public String emitirSom() {
        return(som);
    }

    public void alimentar() {
        if (getAlimentado() == false) {
            setAlimentado(true);
            System.out.println("O animal foi alimentado!");
        } else {
            System.out.println("O animal vai explodir");
        }
    }
}
