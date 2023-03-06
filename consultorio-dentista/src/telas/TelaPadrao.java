package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes_auxiliares.Constantes;

public abstract class TelaPadrao extends JFrame {

	protected JPanel painelPrincipal;

	public TelaPadrao() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(Constantes.medidaXTelaApresentacao, Constantes.medidaYTelaApresentacao, Constantes.alturaTelaApresentacao, Constantes.larguraTelaApresentacao);
		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Constantes.corFundo);
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		adicionarLbl();
		adicionarBtn();
		adicionarTxtFields();
		adicionarOuvintes();
		
		this.setVisible(true);
		
		
		
	}

	public void adicionarBtn() {}
	
	public void adicionarLbl() {}
	
	public void adicionarTxtFields() {}
	
	public abstract void adicionarOuvintes();
	
	
}
