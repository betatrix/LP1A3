package com.example.atividadejavafx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

//Fiz com o padrão MVC para treinar
public class AnimalController {
    @FXML
    private Button btn_pesquisar;

    @FXML
    private Button btn_cadastrar;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    private List<Animal> animais;

    public void initialize() {
        animais = new ArrayList<>();
        Animal a1 = new Animal(1, "Carlinhos", 10);
        Animal a2 = new Animal(2, "Meg", 13);
        Animal a3 = new Animal(3, "Maya", 1);
        Animal a4 = new Animal(4, "Koda", 20);
        Animal a5 = new Animal(5, "Wandinha", 2);

        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        animais.add(a5);

        List<String> nomesAnimais = new ArrayList<>();
        for (Animal animal : animais) {
            nomesAnimais.add(animal.getNome());
    }

        //Tive muita dificuldade nessa parte, não sei se é a abordagem certa
        comboBox.setItems(FXCollections.observableArrayList(nomesAnimais));
    }

    //Nessa também
    public void animalCaracteristicas() {
        String nomeAnimal = comboBox.getValue();

        if (nomeAnimal != null) {
            for (Animal animal : animais) {
                if (animal.getNome().equals(nomeAnimal)) {
                    String caracteristicas = "- ID: " + animal.getId() + "\n"
                            + "- Nome: " + animal.getNome() + "\n"
                            + "- Idade: " + animal.getIdade();

                    textArea.setText(caracteristicas);
                    break;
                }
            }
        }
    }


//    public void adicionarAnimal() {
//        String idString = text1.getText();
//        String nome = text2.getText();
//        String idadeString = text3.getText();
//
//
//        if (!nome.isEmpty() && !idadeString.isEmpty() && !idString.isEmpty()) {
//            int idade = Integer.parseInt(idadeString);
//            int id = Integer.parseInt(idString);
//
//
//            Animal novoAnimal = new Animal(id, nome, idade);
//            animais.add(novoAnimal);
//
//            comboBox.getItems().add(nome);
//
//            limparCampos();
//        }
//    }
//    public void limparCampos() {
//        text1.clear();
//        text2.clear();
//        text3.clear();
//    }
}