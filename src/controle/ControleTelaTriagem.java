package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Funcionalidades;
import visao.TelaPrincipal;
import visao.TelaTriagem;

public class ControleTelaTriagem implements ActionListener{
	//instanciados os objetos
	private Funcionalidades f;
	private TelaPrincipal tp;
	private TelaTriagem tt;
	
	//controle da tela e seus objetos
	public ControleTelaTriagem(Funcionalidades f, TelaPrincipal tp, TelaTriagem tt) {
		super();
		this.f = f;
		this.tp = tp;
		this.tt = tt;
		

		this.tt.getBtnConcluirTriagem().addActionListener(this);
		this.tt.getBtnLimparCampos().addActionListener(this);
		this.tt.getMntmSair().addActionListener(this);
		this.tt.getMntmTelaPrincipal().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		//antes de retornar limpa todos os campos e fecha a tela dispose()
		if(e.getActionCommand().equals("Tela Principal")) {
			this.tt.getTextFieldFreqCard().setText("");
			this.tt.getTextFieldFreqResp().setText("");
			this.tt.getTextFieldIPFR().setText("");
			this.tt.getTextFieldOxi().setText("");
			this.tt.getTextFieldTemp().setText("");
			this.tt.getRdbtnNo().setSelected(false);
			this.tt.getRdbtnNo_1().setSelected(false);
			this.tt.getRdbtnSim().setSelected(false);
			this.tt.getRdbtnSim_1().setSelected(false);
			this.tt.getBg().clearSelection();
			this.tt.getBug().clearSelection();
			this.tt.getComboBox().setSelectedIndex(0);
			this.tp.setVisible(true);
			this.tt.dispose();
		}
		//limpa campos
		if(e.getActionCommand().equals("Limpar Campos")) {
			this.tt.getTextFieldFreqCard().setText("");
			this.tt.getTextFieldFreqResp().setText("");
			this.tt.getTextFieldIPFR().setText("");
			this.tt.getTextFieldOxi().setText("");
			this.tt.getTextFieldTemp().setText("");
			this.tt.getComboBox().setSelectedIndex(0);
			this.tt.getBg().clearSelection();
			this.tt.getBug().clearSelection();
			this.tt.getRdbtnNo().setSelected(false);
			this.tt.getRdbtnNo_1().setSelected(false);
			this.tt.getRdbtnSim().setSelected(false);
			this.tt.getRdbtnSim_1().setSelected(false);
		}
		
		//conclui triagem atribuindo uma prioridade ao paciente
		if(e.getActionCommand().equals("Concluir Triagem")) {
			try {
			if(this.tt.getRdbtnSim().isSelected()) {
				this.f.realizaTriagem(1, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			}
			else if (this.tt.getRdbtnSim_1().isSelected()) {
				this.f.realizaTriagem(2, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			}
			else if (this.tt.getComboBox().getSelectedItem() != "" & this.tt.getComboBox().getSelectedItem() != "Zero" & this.tt.getComboBox().getSelectedItem() != "Um") {
					if(Integer.parseInt(this.tt.getTextFieldFreqCard().getText())>90 || Integer.parseInt(this.tt.getTextFieldFreqResp().getText())>20 || (Integer.parseInt(this.tt.getTextFieldTemp().getText())<36 || Integer.parseInt(this.tt.getTextFieldTemp().getText())>38) || Integer.parseInt(this.tt.getTextFieldOxi().getText())<90 || Integer.parseInt(this.tt.getTextFieldIPFR().getText())<200) {
				this.f.realizaTriagem(2, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			} else {
				this.f.realizaTriagem(3, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			}
			} else if (this.tt.getComboBox().getSelectedItem().equals("Um")) {
				this.f.realizaTriagem(4, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			} else {
				this.f.realizaTriagem(5, Integer.parseInt(this.tt.getTextFieldTemp().getText()));
			}
			try{
				this.tt.getLblPacnome().setText(this.f.retornaCabeca().getPessoa().getNome());
			}catch (Exception e2) {
			}
			//limpa todos os campos e sai da tela
			this.tt.getTextFieldFreqCard().setText("");
			this.tt.getTextFieldFreqResp().setText("");
			this.tt.getTextFieldIPFR().setText("");
			this.tt.getTextFieldOxi().setText("");
			this.tt.getTextFieldTemp().setText("");
			this.tt.getRdbtnNo().setSelected(false);
			this.tt.getBg().clearSelection();
			this.tt.getBug().clearSelection();
			this.tt.getRdbtnNo_1().setSelected(false);
			this.tt.getRdbtnSim().setSelected(false);
			this.tt.getRdbtnSim_1().setSelected(false);
			this.tt.getComboBox().setSelectedIndex(0);
			JOptionPane.showMessageDialog(null, "Triagem Concluida");
			this.tp.setVisible(true);
			this.tt.dispose();
			}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Parece que voc� n�o preencheu alguns campos...");
			}
		}
		
	}

}
