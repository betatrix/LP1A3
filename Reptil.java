package com.company;

public class Reptil extends Animal{
    private double temperaturaCorporal;
    private String som;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal, String som) {
        super(nome, idade, especie, alimentado);
        this.som = som;
    }

    public double temperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public String emitirSom() {
        return (som);
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

