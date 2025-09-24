package main;

import controller.Navegador;
import model.UsuarioDAO;
import view.Janela;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Janela janela = new Janela();
	Navegador navegar = new Navegador(janela);
	UsuarioDAO dao = new UsuarioDAO();
	
}
