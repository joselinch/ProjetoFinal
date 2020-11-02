package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import modelo.Funcionalidades;
import visao.TelaPrincipal;
import visao.TelaRealizarConsulta;

public class ControleTelaRealizarConsulta implements ActionListener {
	//instanciados os objetos
	private TelaPrincipal tp;
	private TelaRealizarConsulta trc;
	private Funcionalidades f;
	
	//construtor do controle com seus objetos
	public ControleTelaRealizarConsulta(TelaPrincipal tp, TelaRealizarConsulta trc, Funcionalidades f) {
		super();
		this.tp = tp;
		this.trc = trc;
		this.f = f;
		
		this.trc.getBtnConcluir().addActionListener(this);
		this.trc.getBtnLimpar().addActionListener(this);
		this.trc.getMntmSair().addActionListener(this);
		this.trc.getMntmTelaPrincipal().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//fecha o programa
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
		//verifica se todos os campos estao preenchidos e realiza a consulta do paciente no modelo
		if(e.getActionCommand().equals("Concluir")) {
			if(this.trc.getTextAreaParecer().getText().equals("") || this.trc.getTextFieldHora().getText().equals("") || this.trc.getTextFieldMinCon().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Algum campo n�o foi preenchido.");
			} else {
				try {
			Atendimento a = this.f.chamaConsulta();
			this.f.realizaConsulta(a, Integer.parseInt(this.trc.getTextFieldHora().getText()), Integer.parseInt(this.trc.getTextFieldMinCon().getText()), this.trc.getTextAreaParecer().getText());
			this.tp.setVisible(true);
			this.trc.getTextAreaParecer().setText("");
			this.trc.getTextFieldHora().setText("");
			this.trc.getTextFieldMinCon().setText("");
			this.trc.dispose();	
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Erro! Verifique os dados inseridos.");
				}
			}
		}
		//limpa campos e vai para a tela principal
		
		if(e.getActionCommand().equals("Tela Principal")) {
			this.tp.setVisible(true);
			this.trc.getTextAreaParecer().setText("");
			this.trc.getTextFieldHora().setText("");
			this.trc.getTextFieldMinCon().setText("");
			this.trc.dispose();
		}
		
		//limpa campos
		if(e.getActionCommand().equals("Limpar")) {
			this.trc.getTextAreaParecer().setText("");
			this.trc.getTextFieldHora().setText("");
			this.trc.getTextFieldMinCon().setText("");
		}
		
	}

}
