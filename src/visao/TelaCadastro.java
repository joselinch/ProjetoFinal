package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JMenuItem mntmTelaPrincipal;
	private JMenuItem mntmSair;
	private JButton btnCadastro;
	private JButton btnLimpar;
	
	
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
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

	public JButton getBtnCadastro() {
		return btnCadastro;
	}

	public void setBtnCadastro(JButton btnCadastro) {
		this.btnCadastro = btnCadastro;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 284);
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
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCadastroDePaciente = new JLabel("CADASTRO DE PACIENTE");
		lblCadastroDePaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblCadastroDePaciente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignOnBaseline(true);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnCadastro = new JButton("Cadastro");
		btnCadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnCadastro);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnLimpar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[][][grow][][][grow]", "[][][][]"));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNome, "cell 0 1,alignx center");
		
		textField = new JTextField();
		panel_2.add(textField, "cell 1 1 5 1,growx");
		textField.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nasc:");
		lblDataNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblDataNascimento, "cell 0 3,alignx trailing");
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, "cell 1 3 2 1,pushx ,growx");
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblCpf, "cell 3 3,alignx center");
		
		textField_2 = new JTextField();
		panel_2.add(textField_2, "cell 4 3 2 1,pushx ,growx");
		textField_2.setColumns(10);
	}

}
