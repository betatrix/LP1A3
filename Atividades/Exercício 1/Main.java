package com.company;

public class Main {

    public static void main(String[] args) {
	    Mamifero m = new Mamifero("Carlinhos", 2,"Macaco-narigudo", false, 165, "uh uh uh ah ah ah uh");
        Ave a = new Ave("Chris", 5, "Tucano", false, "É largo, longo, com tonalidade alaranjada vibrante, estrias rubras perpendiculares ao eixo principal e uma mancha negra na extremidade e possuí 20 cm", "grr gruuuunkt greeeeekt-eeeek aaark");
        Reptil r = new Reptil("Lacoste", 3, "Lagartixa", true, -5, "ah");

        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(m);
        zoo.adicionarAnimal(a);
        zoo.adicionarAnimal(r);
        zoo.listarAnimais();
        zoo.alimentarAnimais();
        zoo.listarAnimais();
    }
}
