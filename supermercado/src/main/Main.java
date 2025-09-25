package main;

import controller.Navegador;
import model.UsuarioDAO;
import view.Janela;
import view.TelaInicial;

public class Main {

	public static void main(String[] args) {
		Janela janela = new Janela();
		Navegador navegador = new Navegador(janela);
		UsuarioDAO dao = new UsuarioDAO();
		
		TelaInicial telaInicial = new TelaInicial();
		
		navegador.adicionarPainel("TELA INICIAL", telaInicial);
		
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

		navegador.navegarPara("TELA INICIAL");

	}
}
