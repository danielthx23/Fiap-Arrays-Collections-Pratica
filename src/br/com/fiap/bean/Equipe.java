package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
    private String nome;
    private ArrayList<String> integrantes;

    public Equipe() {
    }

    public Equipe(String nome, ArrayList<String> integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public void listaEquipe() {
        String exibe = "Nome da equipe: " + nome;
        Collections.sort(integrantes);
        int cont = 1;
        for(String integrante : integrantes) {
            exibe += "\nIntegrante " + cont + ": " + integrante;
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
