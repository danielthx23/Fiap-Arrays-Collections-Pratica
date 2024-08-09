package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;
import javax.swing.*;
import java.util.ArrayList;

public class UsaSuperHeroi {
    public static void main(String[] args) {
        SuperHeroi superHeroi;
        String nome, idSecreto, poder, fraqueza;
        ArrayList<String> poderes = new ArrayList<String>();
        ArrayList<String> fraquezas = new ArrayList<String>();

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do super heroi");
                idSecreto = JOptionPane.showInputDialog("Digite o id secreto do super heroi");
                do {
                    poder = JOptionPane.showInputDialog("Digite um dos poderes desse super heroi ou digite \"fim\" para encerrar");
                    poderes.add(poder);
                } while (!poder.equalsIgnoreCase("fim"));
                poderes.removeLast();
                do {
                    fraqueza = JOptionPane.showInputDialog("Digite um das fraquezas desse super heroi ou digite \"fim\" para encerrar");
                    fraquezas.add(fraqueza);
                } while (!fraqueza.equalsIgnoreCase("fim"));
                fraquezas.removeLast();
                superHeroi = new SuperHeroi(nome, idSecreto, poderes, fraquezas);
                superHeroi.listaHeroi();
                poderes.clear();
                fraquezas.clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
