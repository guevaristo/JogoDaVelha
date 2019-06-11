package jogo;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jogo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Jogo da Velha");
		frame.setSize(600, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		painel painel = new painel();
		painel.setBounds(0, 0, 600, 600);
		frame.add(painel);

		frame.addMouseListener(painel);

	}

}