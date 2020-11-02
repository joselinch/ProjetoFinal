package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Funcionalidades;
import modelo.Paciente;
import visao.TelaConsulta;
import visao.TelaPrincipal;


public class ControleTelaConsulta implements ActionListener{
	//instancia objetos
	private TelaPrincipal tp;
	private TelaConsulta tco;
	private Funcionalidades f;
	private Paciente p;
	//construtor com os objetos
	
	public ControleTelaConsulta(TelaPrincipal tp, TelaConsulta tco, Funcionalidades f, Paciente p) {
		super();
		this.tp = tp;
		this.tco = tco;
		this.f = f;
		this.p = p;
		
		
		//adiciona action listeners aos botoes
		this.tco.getBtnVoltar().addActionListener(this);
		this.tco.getMntmSair().addActionListener(this);
		this.tco.getMntmTelaPrincipal().addActionListener(this);
		this.tco.getBtnConsultar().addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// retorna ao menu principal
		if(e.getActionCommand().equals("Voltar")) {
			this.tco.getLblCpfpac().setText("");
			this.tco.getLblNomepac().setText("");
			this.tco.getLblDatanasc().setText("");
			this.tp.setVisible(true);
			this.tco.dispose();
		}
		//finaliza o programa
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		//volta para a tela principal limpando todos os campos
		if(e.getActionCommand().equals("Tela Principal")) {
			this.tco.getLblCpfpac().setText("");
			this.tco.getLblNomepac().setText("");
			this.tco.getLblDatanasc().setText("");
			this.tp.setVisible(true);
			this.tco.dispose();
		}
		//consulta o cadastro do paciente na lista atraves do cpf solicitando ao modelo
		if(e.getActionCommand().equals("Consultar")) {
			String cpf = JOptionPane.showInputDialog("Por favor, digite o CPF:");
			try {
			Paciente cadastrado = this.f.consultaCadastro(cpf);
			this.tco.getLblCpfpac().setText(cadastrado.getCpf());
			this.tco.getLblNomepac().setText(cadastrado.getNome());
			this.tco.getLblDatanasc().setText(Integer.toString(cadastrado.getAnoNascimento()));
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "O CPF informado n�o est� presente nos cadastros.");
			}
		}
	}

}
