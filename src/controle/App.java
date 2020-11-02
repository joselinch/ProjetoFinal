package controle;

import java.util.Scanner;

import dao.RelatoriosDAO;
import modelo.Atendimento;
import modelo.Funcionalidades;
import modelo.Paciente;
import visao.TelaAtendimento;
import visao.TelaCadastro;
import visao.TelaConsulta;
import visao.TelaLogin;
import visao.TelaPrincipal;
import visao.TelaRealizarConsulta;
import visao.TelaTriagem;


public class App {
	
public static void main(String[] args) {

		//instancia os objetos das telas, das filas, listas e funcionalidades.
		TelaCadastro tc = new TelaCadastro();
		TelaPrincipal tp = new TelaPrincipal();
		TelaTriagem tt = new TelaTriagem();
		TelaConsulta tco = new TelaConsulta();	
		TelaLogin tl = new TelaLogin();
		TelaAtendimento ta = new TelaAtendimento();
		TelaRealizarConsulta trc = new TelaRealizarConsulta();
		Funcionalidades f = new Funcionalidades();
		RelatoriosDAO r = new RelatoriosDAO();
		Paciente p = new Paciente();
		Atendimento a = new Atendimento(); 
		
		//cria os construtores de cada tela com seus respectivos objetos
		ControleTelaRealizarConsulta controletrc = new ControleTelaRealizarConsulta(tp, trc, f);
		ControleTelaTriagem controlett = new ControleTelaTriagem(f, tp, tt);
		ControleTelaAtendimento controleta = new ControleTelaAtendimento(a, ta, tp, f, p);
		ControleTelaCadastro controletc = new ControleTelaCadastro(tp, tc, f, p);
		ControleTelaConsulta controletco = new ControleTelaConsulta(tp, tco, f, p);
		ControleTelaPrincipal controletp = new ControleTelaPrincipal(tp, tc, tco, tt, ta, trc, r);
		ControleTelaLogin controletl = new ControleTelaLogin(tp, tl);
		
		//deixa a tela de login visivel
		tl.setVisible(true);
		
}
}