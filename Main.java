package com.fatecpoojava.prjrJoKenPo;

import com.fatecpoojava.prjrJoKenPo.View.layoutJoKenPo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // chamando a janela do jogo
        JFrame tela = new JFrame();
        tela.setContentPane(new layoutJoKenPo().getPainelMovimento());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
