package com.company;

public class Mamifero extends Animal{
    private int tempoGestacao;
    private String som;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, int tempoGestacao, String som){
        super (nome, idade, especie, alimentado);
        this.som = som;
    }

    public int getTempoGestacao(){
        return tempoGestacao;
    }

    public void setNome(int tempoGestacao){
        this.tempoGestacao= tempoGestacao;
    }

    public String emitirSom(){
        return(som);
    }

    public void alimentar() {
        if (getAlimentado() == false) {
            setAlimentado(true);
            System.out.println("O animal foi alimentado!");
        } else {
            System.out.println("O animal vai explodir :(");
        }
    }
}
