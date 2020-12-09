package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setLocationRelativeTo(null);
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCreditos = new JButton("Creditos");
		btnCreditos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Credito crd = new Credito();
				crd.setLocationRelativeTo(null);
				crd.setVisible(true);
			}
		});
		btnCreditos.setBounds(10, 286, 94, 23);
		
		JLabel lblHerramientaParaLa = new JLabel("Herramienta para la verificacion de ejercicios de vigas");
		lblHerramientaParaLa.setBounds(34, 244, 351, 14);
		lblHerramientaParaLa.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.setLayout(null);
		contentPane.add(btnCreditos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(78, 45, 265, 177);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/ui/SMbeamsInicio.png")));
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(343, 129, 0, 0);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(343, 129, 0, 0);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("");
		label.setBounds(343, 129, 0, 0);
		contentPane.add(label);
		contentPane.add(lblHerramientaParaLa);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Diseno solver = new Diseno();
				solver.setLocationRelativeTo(null);
				solver.setVisible(true);
			}
		});
		btnContinuar.setBounds(324, 286, 89, 23);
		contentPane.add(btnContinuar);
	}
}
