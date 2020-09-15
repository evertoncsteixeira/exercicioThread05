package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JTextField;
public class CarroMovimento implements ActionListener {
	private JLabel lblCarro01;
	private JLabel lblCarro02;
	private JButton btnCorrer;
	private JTextField txtVencedor;
	private JTextField txtPerdedor;

	private int v;
	private int d;
	public CarroMovimento(JLabel lblCarro01,JLabel lblCarro02, JButton btnCorrer,int v, int d,
			JTextField txtVencedor, JTextField txtPerdedor) {
		this.lblCarro01 = lblCarro01;
		this.lblCarro02 = lblCarro02;
		this.btnCorrer = btnCorrer;
		this.d = d;
		this.v = v;
		this.txtVencedor = txtVencedor;
		this.txtPerdedor = txtPerdedor;

	}
	
	private void botaoCorrer(){
		Thread t1 = new ThreadCarro(lblCarro01, btnCorrer, v, d, txtVencedor, txtPerdedor);
		Thread t2 = new ThreadCarro(lblCarro02, btnCorrer, v, d, txtVencedor, txtPerdedor);
		t1.start();
		t2.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botaoCorrer();
	}
}
