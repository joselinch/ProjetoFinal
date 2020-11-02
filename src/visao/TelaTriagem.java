package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaTriagem extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFreqCard;
	private JTextField textFieldTemp;
	private JTextField textFieldOxi;
	private JTextField textFieldFreqResp;
	private JTextField textFieldIPFR;
	private JMenuItem mntmTelaPrincipal;
	private JMenuItem mntmSair;
	private JButton btnLimparCampos;
	private JButton btnConcluirTriagem;
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNo;
	private JRadioButton rdbtnSim_1;
	private JRadioButton rdbtnNo_1;
	private JComboBox comboBox;
	private JLabel lblNomeDoPaciente;
	private JLabel lblPacnome;
	private ButtonGroup bg;
	private ButtonGroup bug;
	/**
	 * Launch the application.
	 */

	public JTextField getTextFieldFreqCard() {
		return textFieldFreqCard;
	}

	public ButtonGroup getBg() {
		return bg;
	}

	public void setBg(ButtonGroup bg) {
		this.bg = bg;
	}

	public ButtonGroup getBug() {
		return bug;
	}

	public void setBug(ButtonGroup bug) {
		this.bug = bug;
	}

	public JLabel getLblPacnome() {
		return lblPacnome;
	}

	public void setLblPacnome(JLabel lblPacnome) {
		this.lblPacnome = lblPacnome;
	}

	public void setTextFieldFreqCard(JTextField textFieldFreqCard) {
		this.textFieldFreqCard = textFieldFreqCard;
	}

	public JTextField getTextFieldTemp() {
		return textFieldTemp;
	}

	public void setTextFieldTemp(JTextField textFieldTemp) {
		this.textFieldTemp = textFieldTemp;
	}

	public JTextField getTextFieldOxi() {
		return textFieldOxi;
	}

	public void setTextFieldOxi(JTextField textFieldOxi) {
		this.textFieldOxi = textFieldOxi;
	}

	public JTextField getTextFieldFreqResp() {
		return textFieldFreqResp;
	}

	public void setTextFieldFreqResp(JTextField textFieldFreqResp) {
		this.textFieldFreqResp = textFieldFreqResp;
	}

	public JTextField getTextFieldIPFR() {
		return textFieldIPFR;
	}

	public void setTextFieldIPFR(JTextField textFieldIPFR) {
		this.textFieldIPFR = textFieldIPFR;
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

	public JButton getBtnLimparCampos() {
		return btnLimparCampos;
	}

	public void setBtnLimparCampos(JButton btnLimparCampos) {
		this.btnLimparCampos = btnLimparCampos;
	}

	public JButton getBtnConcluirTriagem() {
		return btnConcluirTriagem;
	}

	public void setBtnConcluirTriagem(JButton btnConcluirTriagem) {
		this.btnConcluirTriagem = btnConcluirTriagem;
	}

	public JRadioButton getRdbtnSim() {
		return rdbtnSim;
	}

	public void setRdbtnSim(JRadioButton rdbtnSim) {
		this.rdbtnSim = rdbtnSim;
	}

	public JRadioButton getRdbtnNo() {
		return rdbtnNo;
	}

	public void setRdbtnNo(JRadioButton rdbtnNo) {
		this.rdbtnNo = rdbtnNo;
	}

	public JRadioButton getRdbtnSim_1() {
		return rdbtnSim_1;
	}

	public void setRdbtnSim_1(JRadioButton rdbtnSim_1) {
		this.rdbtnSim_1 = rdbtnSim_1;
	}

	public JRadioButton getRdbtnNo_1() {
		return rdbtnNo_1;
	}

	public void setRdbtnNo_1(JRadioButton rdbtnNo_1) {
		this.rdbtnNo_1 = rdbtnNo_1;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * Create the frame.
	 */
	public TelaTriagem() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 338);
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
		
		JLabel lblTriagemDoPaciente = new JLabel("TRIAGEM DO PACIENTE");
		lblTriagemDoPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblTriagemDoPaciente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnConcluirTriagem = new JButton("Concluir Triagem");
		btnConcluirTriagem.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnConcluirTriagem);
		
		btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnLimparCampos);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[][][grow][grow]", "[][][][][][][]"));
		
		JLabel lblOPacienteEstiver = new JLabel("O paciente est\u00E1 entubado, com apneia, sem pulso ou sem rea\u00E7\u00E3o?");
		panel_2.add(lblOPacienteEstiver, "cell 1 0");
		
		rdbtnSim = new JRadioButton("Sim");
		panel_2.add(rdbtnSim, "cell 2 0");
		
		rdbtnNo = new JRadioButton("N\u00E3o");
		panel_2.add(rdbtnNo, "cell 3 0");
		
		JLabel lblOPacienteEstiver_1 = new JLabel("Em situa\u00E7\u00E3o de risco, confuso, desorientado, let\u00E1rgico, ou em dor?");
		panel_2.add(lblOPacienteEstiver_1, "cell 1 1");
		
		rdbtnSim_1 = new JRadioButton("Sim");
		panel_2.add(rdbtnSim_1, "cell 2 1");
		
		rdbtnNo_1 = new JRadioButton("N\u00E3o");
		panel_2.add(rdbtnNo_1, "cell 3 1");
		
		JLabel lblQuantos = new JLabel("Quantos procedimentos al\u00E9m da consulta m\u00E9dica necessita realizar?");
		panel_2.add(lblQuantos, "cell 1 2,alignx left");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Zero", "Um", "Dois", "Tr\u00EAs", "Mais"}));
		panel_2.add(comboBox, "cell 2 2 2 1,growx");
		
		JLabel lblFrequnciaCardaca = new JLabel("Frequ\u00EAncia Card\u00EDaca:");
		panel_2.add(lblFrequnciaCardaca, "flowx,cell 1 3");
		
		textFieldFreqCard = new JTextField();
		panel_2.add(textFieldFreqCard, "cell 1 3");
		textFieldFreqCard.setColumns(10);
		
		JLabel lblTemperaturaCorporal = new JLabel("Temperatura:");
		panel_2.add(lblTemperaturaCorporal, "cell 1 3");
		
		textFieldTemp = new JTextField();
		panel_2.add(textFieldTemp, "cell 1 3");
		textFieldTemp.setColumns(10);
		
		JLabel lblOximetria = new JLabel("Oximetria:");
		panel_2.add(lblOximetria, "cell 2 3,alignx trailing");
		
		textFieldOxi = new JTextField();
		panel_2.add(textFieldOxi, "cell 3 3,growx");
		textFieldOxi.setColumns(10);
		
		JLabel lblFrequnciaRespiratria = new JLabel("Frequ\u00EAncia Respirat\u00F3ria:");
		panel_2.add(lblFrequnciaRespiratria, "flowx,cell 1 4");
		
		textFieldFreqResp = new JTextField();
		panel_2.add(textFieldFreqResp, "cell 1 4,growx");
		textFieldFreqResp.setColumns(10);
		
		JLabel lblndiceDePico = new JLabel("IPFR");
		panel_2.add(lblndiceDePico, "flowx,cell 2 4");
		
		textFieldIPFR = new JTextField();
		panel_2.add(textFieldIPFR, "cell 3 4");
		textFieldIPFR.setColumns(10);
		

		bg = new ButtonGroup();
		bg.add(rdbtnNo);
		bg.add(rdbtnSim);
		
		bug = new ButtonGroup();
		bug.add(rdbtnNo_1);
		bug.add(rdbtnSim_1);
		
		lblNomeDoPaciente = new JLabel("Nome do Paciente:");
		panel_2.add(lblNomeDoPaciente, "flowx,cell 1 6");
		
		lblPacnome = new JLabel("pacNome");
		lblPacnome.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblPacnome, "cell 1 6 3 1");
	}

}
