package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.AtendimentoDAO;
import modelo.Atendimento;
import modelo.Funcionalidades;
import modelo.Paciente;
import visao.TelaAtendimento;
import visao.TelaPrincipal;

public class ControleTelaAtendimento implements ActionListener {

	//instanciados os objetos
	private Atendimento a;
	private AtendimentoDAO aDAO;
	private TelaAtendimento ta;
	private TelaPrincipal tp;
	private Funcionalidades f;
	private Paciente p;
	
	//construtor do controle
	public ControleTelaAtendimento(Atendimento a, TelaAtendimento ta, TelaPrincipal tp,
			Funcionalidades f, Paciente p) {
		super();
		this.a = a;
		this.ta = ta;
		this.tp = tp;
		this.f = f;
		this.p = p;
		
		aDAO = new AtendimentoDAO();
		
		//adiciona os action listeners aos botoes
		this.ta.getBtnConfirmar().addActionListener(this);
		this.ta.getBtnLimpar().addActionListener(this);
		this.ta.getMntmSair().addActionListener(this);
		this.ta.getMntmTelaPrincipal().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Confirmar")) {
			//verificacao se todos os campos estao preenchidos
			if (this.ta.getTextFieldCPF().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Existem campos que n�o foram preenchido");
			}
			else if (this.ta.getTextFieldDATA().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Existem campos que n�o foram preenchidos.");
			}
			else if (this.ta.getTextFieldHr().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Existem campos que n�o foram preenchidos.");
			}
			else if (this.ta.getTextFieldMin().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Existem campos que n�o foram preenchidos.");
			}
			else if (this.ta.getTextFieldSenha().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Existem campos que n�o foram preenchidos.");
			}
			else if(this.f.consultaCadastro(this.ta.getTextFieldCPF().getText()).equals("")) {
				JOptionPane.showMessageDialog(null, "CPF inserido n�o est� cadastrado.");
			}else{
				if(this.f.consultaCadastro(this.ta.getTextFieldCPF().getText()) != null) {
				try {
					//tenta inserir o paciente no DAO para salvar no txt e na lista e limpa campos e vai ao menu inicial
					Paciente cadastrado = this.f.consultaCadastro(this.ta.getTextFieldCPF().getText());
					this.aDAO.escreveArquivo(cadastrado.getNome(), this.ta.getTextFieldDATA().getText(), Integer.parseInt(this.ta.getTextFieldHr().getText()), Integer.parseInt(this.ta.getTextFieldMin().getText()));
					this.f.realizaAtendimento(cadastrado, this.ta.getTextFieldDATA().getText(), Integer.parseInt(this.ta.getTextFieldHr().getText()), Integer.parseInt(this.ta.getTextFieldMin().getText()));
					this.ta.getTextFieldCPF().setText("");
					this.ta.getTextFieldDATA().setText("");
					this.ta.getTextFieldHr().setText("");
					this.ta.getTextFieldMin().setText("");
					this.ta.getTextFieldSenha().setText("");
					this.tp.setVisible(true);
					this.ta.dispose();
					} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados, tente novamente.");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados, tente novamente.");
				}
			;
				}
		}
			
			//limpa todos os campos
		if(e.getActionCommand().equals("Limpar")) {
			this.ta.getTextFieldCPF().setText("");
			this.ta.getTextFieldDATA().setText("");
			this.ta.getTextFieldHr().setText("");
			this.ta.getTextFieldMin().setText("");
			this.ta.getTextFieldSenha().setText("");
		}
		
		//sai do programa
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
		//retorna ao menu inicial
		
		if(e.getActionCommand().equals("Tela Principal")) {
			this.ta.getTextFieldCPF().setText("");
			this.ta.getTextFieldDATA().setText("");
			this.ta.getTextFieldHr().setText("");
			this.ta.getTextFieldMin().setText("");
			this.ta.getTextFieldSenha().setText("");
			this.tp.setVisible(true);
			this.ta.dispose();
		}
		
	}
	}
}
