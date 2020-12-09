package ui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Credito extends JFrame {

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
					Credito frame = new Credito();
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
	public Credito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSmBeamsAplicacion = new JTextPane();
		txtpnSmBeamsAplicacion.setEditable(false);
		txtpnSmBeamsAplicacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSmBeamsAplicacion.setText("SM BEAMS\r\n\r\nAplicacion para la solucion de problemas de vigas con apoyos simples estaticamente indeterminadas. Desarrollada para facilitar la preparacion de parciales de resolucion de estrucutras estaticamente indeterminadas por el metodo de la superposicion. Las ecuaciones de compatibilidad que se usan estan basadas en desplazamientos elasticos.\r\n\r\nDesarrollada por:\r\n- Diego Felipe Sanchez Medina\r\n- Oscar Andres Sanchez Medina\r\n\r\nProyecto de POO - UNAL - 2018-2S");
		txtpnSmBeamsAplicacion.setBounds(23, 31, 390, 219);
		contentPane.add(txtpnSmBeamsAplicacion);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Inicio ini = new Inicio();
				ini.setLocationRelativeTo(null);
				ini.setVisible(true);
			}
		});
		btnRegresar.setBounds(324, 282, 89, 23);
		contentPane.add(btnRegresar);
	}
}
