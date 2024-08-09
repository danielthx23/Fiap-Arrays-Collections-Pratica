package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private ArrayList<String> poderes;
    private ArrayList<String> fraquezas;

    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public ArrayList<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(ArrayList<String> fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listaHeroi() {
        String exibe = "Nome: " + nome +
                "\nidSecreta: " + idSecreta;
        Collections.sort(poderes);
        Collections.sort(fraquezas);
        exibe += "\nPoderes: ";
        for(String poder: poderes) {
            exibe += "\n" + poder;
        }
        exibe += "\nFraquezas: ";
        for(String fraqueza: fraquezas) {
            exibe += "\n" + fraqueza;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
