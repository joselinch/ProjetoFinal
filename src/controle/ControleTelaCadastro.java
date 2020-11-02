package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.CadastrosDAO;
import modelo.Funcionalidades;
import modelo.Paciente;
import visao.TelaCadastro;
import visao.TelaPrincipal;

public class ControleTelaCadastro implements ActionListener{

	private TelaPrincipal tp;
	private TelaCadastro tc;
	private Funcionalidades f;
	private Paciente p;
	private CadastrosDAO cadDAO;
	
	public ControleTelaCadastro(TelaPrincipal tp, TelaCadastro tc, Funcionalidades f, Paciente p) 
	{
		super();
		this.f = f;
		this.tc = tc;
		this.tp = tp;
		this.p = p;
		
		//DAO PARA GRAVAR EM ARQUIVO OS CADASTROS
		cadDAO = new CadastrosDAO();
		
		//adiciona action listeener aos botoes
		this.tc.getBtnCadastro().addActionListener(this);
		this.tc.getBtnLimpar().addActionListener(this);
		this.tc.getMntmSair().addActionListener(this);
		this.tc.getMntmTelaPrincipal().addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		//encerra o programa
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
		//limpa todos os campos
		if(e.getActionCommand().equals("Limpar")) {
			this.tc.getTextField().setText("");
			this.tc.getTextField_1().setText("");
			this.tc.getTextField_2().setText("");
		}
		
		//limpa todos os campos e vai ao menu inicial
		if(e.getActionCommand().equals("Tela Principal")) {
			this.tc.getTextField().setText("");
			this.tc.getTextField_1().setText("");
			this.tc.getTextField_2().setText("");
			this.tp.setVisible(true);
			this.tc.dispose();
		}
		
		//verifica se ha algum campo nao preenchido e realiza o cadastro do paciente e retorna ao menu inicial limpando os campos
		if(e.getActionCommand().equals("Cadastro")) {
		if(this.tc.getTextField().getText().equals("") || this.tc.getTextField_1().getText().equals("") || this.tc.getTextField_2().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Existem campos n�o preenchidos, por favor, preencha todos.");
		}
		else {
		try {
			Paciente dado =	this.f.cadastroPaciente(this.tc.getTextField().getText(), Integer.parseInt(this.tc.getTextField_1().getText()), this.tc.getTextField_2().getText());
			this.f.listaCadastro.addEnd(dado);
			this.cadDAO.escreveArquivo(this.tc.getTextField().getText(), this.tc.getTextField_2().getText(), this.tc.getTextField_1().getText());
			JOptionPane.showMessageDialog(null, "Paciente cadastrado!");
			this.tp.setVisible(true);
			this.tc.getTextField().setText("");
			this.tc.getTextField_1().setText("");
			this.tc.getTextField_2().setText("");
			this.tc.dispose();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Obtivemos problemas no cadastro.");
		}
		}
	}
	}
}
