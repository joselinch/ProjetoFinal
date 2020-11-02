package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPasswordField passwordField;
	
	
	public JTextField getTextField() {
		return textUsuario;
	}

	public void setTextField(JTextField textField) {
		this.textUsuario = textField;
	}

	public JPasswordField getTextField_1() {
		return passwordField;
	}

	public void setTextField_1(JPasswordField textField_1) {
		this.passwordField = textField_1;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 287);
		setLocationRelativeTo( null );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Acessar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Login");
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new MigLayout("", "[grow]", "[][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblNewLabel_1, "cell 0 1,alignx center,aligny center");
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(textUsuario, "cell 0 2,growx,aligny center");
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblNewLabel_2, "cell 0 3,alignx center,aligny center");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(passwordField, "cell 0 4,growx");
	}

}
