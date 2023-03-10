package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes_auxiliares.Constantes;
import javax.swing.JPasswordField;

public class TelaLogin extends TelaPadrao {

	private JTextField txtFEmail;
	private JLabel lblEsqueciMinhaSenha ;
	private JButton btnLogin;
	private JPasswordField passwordField;
	private JLabel lblTelaLogin;
	private JLabel lblEmail;
	private JLabel lblSenha;
	
	public TelaLogin() {
		

	}
	

	@Override
	public void adicionarLbl() {
		
		lblTelaLogin = new JLabel("Tela Login");
		lblTelaLogin.setFont(Constantes.tipoFonteTitulo);
		lblTelaLogin.setBounds(199, 74, 108, 23);
		painelPrincipal.add(lblTelaLogin);


		lblEmail = new JLabel("Email");
		lblEmail.setFont(Constantes.tipoFonteTexto);
		lblEmail.setBounds(54, 169, 70, 25);
		painelPrincipal.add(lblEmail);

		lblSenha = new JLabel("Senha");
		lblSenha.setFont(Constantes.tipoFonteTexto);
		lblSenha.setBounds(54, 225, 70, 25);
		painelPrincipal.add(lblSenha);
		
		lblEsqueciMinhaSenha = new JLabel("esqueci minha senha");
		lblEsqueciMinhaSenha.setBounds(221, 283, 150, 23);
		painelPrincipal.add(lblEsqueciMinhaSenha);
		
	}
	
	@Override
	public void adicionarBtn() {

		btnLogin = new JButton("Login");
		btnLogin.setBounds(190, 357, 117, 25);
		painelPrincipal.add(btnLogin);
	}
	
	@Override
	public void adicionarTxtFields() {

		txtFEmail = new JTextField();
		txtFEmail.setBounds(169, 164, 188, 36);
		painelPrincipal.add(txtFEmail);
		txtFEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 217, 188, 36);
		painelPrincipal.add(passwordField);
	}
	
	

	public void adicionarOuvintes() {

		this.lblEsqueciMinhaSenha.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {

				lblEsqueciMinhaSenha.setText("esqueci minha senha");
				lblEsqueciMinhaSenha.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblEsqueciMinhaSenha.setForeground(Color.black);
			
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				lblEsqueciMinhaSenha.setText("<html><u>esqueci minha senha</u>");
				lblEsqueciMinhaSenha.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblEsqueciMinhaSenha.setForeground(Color.blue);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				//new TelaInserirEmail
				
			}


		});
		
		
		this.btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//l??gica de login
			}
		});
		
		


	}
}
