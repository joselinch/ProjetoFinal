package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaAtendimento extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;
	private JTextField textFieldDATA;
	private JTextField textFieldHr;
	private JTextField textFieldMin;
	private JTextField textFieldSenha;
	private JMenuItem mntmTelaPrincipal;
	private JMenuItem mntmSair;
	private JButton btnConfirmar;
	private JButton btnLimpar;
	
	
	public JTextField getTextFieldCPF() {
		return textFieldCPF;
	}

	public void setTextFieldCPF(JTextField textFieldCPF) {
		this.textFieldCPF = textFieldCPF;
	}

	public JTextField getTextFieldDATA() {
		return textFieldDATA;
	}

	public void setTextFieldDATA(JTextField textFieldDATA) {
		this.textFieldDATA = textFieldDATA;
	}

	public JTextField getTextFieldHr() {
		return textFieldHr;
	}

	public void setTextFieldHr(JTextField textFieldHr) {
		this.textFieldHr = textFieldHr;
	}

	public JTextField getTextFieldMin() {
		return textFieldMin;
	}

	public void setTextFieldMin(JTextField textFieldMin) {
		this.textFieldMin = textFieldMin;
	}

	public JTextField getTextFieldSenha() {
		return textFieldSenha;
	}

	public void setTextFieldSenha(JTextField textFieldSenha) {
		this.textFieldSenha = textFieldSenha;
	}

	public JMenuItem getMntmTelaPrincipal() {
		return mntmTelaPrincipal;
	}

	public void setMntmTelaPrincipal(JMenuItem mntmTelaPrincipal) {
		this.mntmTelaPrincipal = mntmTelaPrincipal;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}


	
	public TelaAtendimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 263);
		setLocationRelativeTo( null );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmTelaPrincipal = new JMenuItem("Tela Principal");
		mnMenu.add(mntmTelaPrincipal);
		
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAtendimento = new JLabel("ATENDIMENTO");
		lblAtendimento.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblAtendimento);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnConfirmar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnLimpar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 25, 32, 14);
		panel_2.add(lblCpf);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(52, 22, 238, 20);
		panel_2.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 77, 32, 14);
		panel_2.add(lblData);
		
		textFieldDATA = new JTextField();
		textFieldDATA.setBounds(52, 74, 86, 20);
		panel_2.add(textFieldDATA);
		textFieldDATA.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(148, 77, 32, 14);
		panel_2.add(lblHora);
		
		textFieldHr = new JTextField();
		textFieldHr.setBounds(190, 74, 86, 20);
		panel_2.add(textFieldHr);
		textFieldHr.setColumns(10);
		
		JLabel lblMinutos = new JLabel("Minutos:");
		lblMinutos.setBounds(286, 77, 50, 14);
		panel_2.add(lblMinutos);
		
		textFieldMin = new JTextField();
		textFieldMin.setBounds(346, 74, 68, 20);
		panel_2.add(textFieldMin);
		textFieldMin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(300, 25, 46, 14);
		panel_2.add(lblSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(346, 22, 68, 20);
		panel_2.add(textFieldSenha);
		textFieldSenha.setColumns(10);
	}
}
