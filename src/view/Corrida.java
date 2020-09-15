package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CarroMovimento;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;


public class Corrida extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVencedor;
	private JTextField txtPerdedor;
	private JTextField textField;


	 
	/**
	 * Launch the application.
	 */

		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Corrida frame = new Corrida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Corrida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel lblCarro01 = new JLabel("Carro01");
		lblCarro01.setForeground(Color.BLUE);
		lblCarro01.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCarro01.setBounds(0, 11, 116, 31);
		contentPane.add(lblCarro01);
		
		JLabel lblCarro02 = new JLabel("Carro02");
		lblCarro02.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCarro02.setForeground(Color.RED);
		lblCarro02.setBounds(0, 136, 116, 31);
		contentPane.add(lblCarro02);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(0, 227, 89, 23);
		contentPane.add(btnCorrer);
		
		
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setBounds(175, 212, 102, 14);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setBounds(175, 257, 102, 14);
		contentPane.add(lblPerdedor);
		
		txtVencedor = new JTextField();
		txtVencedor.setEditable(false);
		txtVencedor.setBounds(280, 209, 138, 20);
		contentPane.add(txtVencedor);
		txtVencedor.setColumns(10);
		
		txtPerdedor = new JTextField();
		txtPerdedor.setEditable(false);
		txtPerdedor.setBounds(280, 254, 138, 20);
		contentPane.add(txtPerdedor);
		txtPerdedor.setColumns(10);
		CarroMovimento carroMovimento = new CarroMovimento(lblCarro01, lblCarro02, btnCorrer,20,900, txtVencedor, txtPerdedor);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(0, 82, 974, 2);
		contentPane.add(textField);
		btnCorrer.addActionListener(carroMovimento);
	}
}
