package com.fatecpoojava.prjrJoKenPo.View;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class layoutJoKenPo {
    private JPanel painelMovimento;
    private JTextArea Visor;
    private JTextArea txtVitórias;
    private JTextArea txtEmpates;
    private JTextArea txtDerrotas;
    private JButton pedraButton;
    private JButton tesouraButton;
    private JButton papelButton;
    private JPanel tela;

    int vitoria, derrota, empate = 0;
    Random gerador = new Random();

    public layoutJoKenPo() {
        //PEDRA = 1
        pedraButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 int escolhaCPU;
                 Visor.setText(null);
                escolhaCPU = gerador.nextInt(3) + 1;
                Visor.append("Sua escolha: Pedra\n");
                if (escolhaCPU == 1){
                    Visor.append("Escolha da CPU: Pedra\n");
                    Visor.append("Empate");
                    empate +=1;
                    txtEmpates.setText("" + empate);
                } else if (escolhaCPU == 2){
                    Visor.append("Escolha da CPU: Papel\n");
                    Visor.append("Derrota");
                    derrota +=1;
                    txtDerrotas.setText(""+derrota);
                } else{
                    Visor.append("Escolha da CPU: Tesoura\n");
                    Visor.append("Vitória");
                    vitoria +=1;
                    txtVitórias.setText("" + vitoria);
                }
            }
        });
        //PAPEL = 2
        papelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int escolhaCPU;
                Visor.setText(null);
                escolhaCPU = gerador.nextInt(3) + 1;
                Visor.append("Sua escolha: Papel\n");
                if (escolhaCPU == 2){
                    Visor.append("Escolha da CPU: Papel\n");
                    Visor.append("Empate");
                    empate +=1;
                    txtEmpates.setText("" + empate);
                } else if (escolhaCPU == 3){
                    Visor.append("Escolha da CPU: Tesoura\n");
                    Visor.append("Derrota");
                    derrota +=1;
                    txtDerrotas.setText(""+derrota);
                } else{
                    Visor.append("Escolha da CPU: Pedra\n");
                    Visor.append("Vitória");
                    vitoria +=1;
                    txtVitórias.setText("" + vitoria);
                }
            }
        });
        //TESOURA = 3
        tesouraButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int escolhaCPU;
                Visor.setText(null);
                escolhaCPU = gerador.nextInt(3) + 1;
                Visor.append("Sua escolha: Tesoura\n");
                if (escolhaCPU == 3){
                    Visor.append("Escolha da CPU: Tesoura\n");
                    Visor.append("Empate");
                    empate +=1;
                    txtEmpates.setText("" + empate);
                } else if (escolhaCPU == 1){
                    Visor.append("Escolha da CPU: Pedra\n");
                    Visor.append("Derrota");
                    derrota +=1;
                    txtDerrotas.setText(""+derrota);
                } else{
                    Visor.append("Escolha da CPU: Papel\n");
                    Visor.append("Vitória");
                    vitoria +=1;
                    txtVitórias.setText("" + vitoria);
                }
            }
        });
    }

    public JPanel getPainelMovimento() {
        return painelMovimento;
    }


}
