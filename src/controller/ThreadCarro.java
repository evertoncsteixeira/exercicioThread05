package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadCarro extends Thread {
	private JLabel lblCarro;
	private JButton btnCorrer;
	private JTextField txtVencedor;
	private JTextField txtPerdedor;
	private int v;
	private int d;

	
	public ThreadCarro(JLabel lblCarro, JButton btnCorrer, int v, int d, 
			JTextField txtVencedor,JTextField txtPerdedor) {
		this.lblCarro = lblCarro;
		this.btnCorrer = btnCorrer;
		this.d = d;
		this.v = v;
		this.txtVencedor  = txtVencedor;
		this.txtPerdedor = txtPerdedor;
	}
	
	private void moverCarro() {
		Random r = new Random();
		btnCorrer.setVisible(false);
		Rectangle posicao;
		posicao = lblCarro.getBounds();
		lblCarro.setBounds(posicao);
		
		posicao.x = 0;
		while (posicao.x < this.d)	{
			posicao.x = posicao.x + r.nextInt(this.v);
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				lblCarro.setBounds(posicao);
				
		}
		if (this.txtVencedor.getText().isEmpty()) {
			this.txtVencedor.setText(lblCarro.getText());
		} else {
			this.txtPerdedor.setText(lblCarro.getText());
		}
		
		btnCorrer.setVisible(true);
	}
	
	@Override
	public void run() {
		moverCarro();
	}
}
