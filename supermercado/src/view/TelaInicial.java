package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TelaInicial extends JPanel {
	private static final long serialVersionUID = 1L;

	public TelaInicial() {
		setPreferredSize(new Dimension(400,300));
		setLayout(null);
		setBackground(new Color(0,0,0));
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.setBackground(new Color(72,61,139));
		btnentrar.setForeground(new Color(255,255,255));
		btnentrar.setBounds(270, 250, 70, 25);
		add(btnentrar);
		
		ImageIcon imagem = new ImageIcon("recursos/fundo.png");
		JLabel label = new JLabel(imagem);
		label.setBounds(0, 0, 400, 300);
		add(label);
	}
	
}
