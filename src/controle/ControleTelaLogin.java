package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.TelaLogin;
import visao.TelaPrincipal;

public class ControleTelaLogin implements ActionListener{
	//instanciados os objetos
	private TelaPrincipal tp;
	private TelaLogin tl;
	
	public ControleTelaLogin (TelaPrincipal tp, TelaLogin tl) {
		super();
		this.tp = tp;
		this.tl = tl;
		
		this.tl.getBtnNewButton().addActionListener(this);
		this.tl.getBtnNewButton_1().addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//verifica se usuario e senha inseridos estao corretos
		if(e.getActionCommand().equals("Acessar")) {
			if (this.tl.getTextField().getText().equals("usuario@ufcspa.edu.br") & this.tl.getTextField_1().getText().equals("senha")) {
				JOptionPane.showMessageDialog(null, "Acesso realizado com sucesso.");
				this.tp.setVisible(true);
				this.tl.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usu�rio ou senha incorreta!");
			}
		}
		//limpa campos
		if(e.getActionCommand().equals("Limpar")) {
			this.tl.getTextField().setText("");
			this.tl.getTextField_1().setText("");
		}
		
	}

}
