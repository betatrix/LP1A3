package com.company;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais(){
        System.out.println("");
        System.out.println("---Lista de animais do Zoológico---");


        for (Animal animal: animais){
            System.out.println("Espécie:" + animal.getEspecie());
            System.out.println("Nome do animal: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Está alimentado? " + animal.getAlimentado());
            System.out.println("");
        }
    }

    public void alimentarAnimais(){
        for(Animal animal: animais){
            animal.alimentar();
        }
    }
}
