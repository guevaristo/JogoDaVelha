package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class painel extends JPanel implements MouseListener {

	int matriz[][];

	public painel() {

		matriz = new int[3][3];

		for (int lin = 0; lin < 3; lin++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(matriz[lin][col]);

			}
			System.out.println();

		}
	}

	// O COMANDO ABAIXO CRIA A JANELA DO jOGO

	public void paintComponent(Graphics g) {

		g.setColor(Color.white);
		g.fillRect(0, 0, 600, 600);

		g.setColor(Color.black);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);

		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);

		for (int lin = 0; lin < 3; lin++) {

			for (int col = 0; col < 3; col++) {
				g.drawString("" + matriz[lin][col], 50 + col*200, 50 + lin*200);

			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		System.out.println(e.getX() + ", " + e.getY());

		int linha = e.getY() / 200;
		int coluna = e.getX() / 200;
		System.out.println("Clicou na linha: " + linha);
		System.out.println("Clicou na coluna: " + coluna);

	}

}
