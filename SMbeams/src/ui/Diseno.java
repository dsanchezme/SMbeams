package ui;

import java.awt.*;

import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import smbeams.SMbeams;

import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Diseno extends JFrame {

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
					Diseno frame = new Diseno();
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
	public Diseno() {
		setTitle("BEAMS SM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(80, 40, 1200, 700);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBounds(50, 100, 2150, 650);
		contentPane.setLayout(null);

		JLabel NombreAPP = new JLabel("BEAMS SM");
		NombreAPP.setFont(new Font("Woodcut", Font.PLAIN, 40));
		NombreAPP.setBounds(245, 23, 626, 44);
		NombreAPP.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(NombreAPP);

		// ****

		JButton btnDibujar = new JButton("Dibujar");
		btnDibujar.setBounds(892, 23, 93, 23);
		contentPane.add(btnDibujar);
		splitPane.setDividerSize(1);
		splitPane.setBounds(20, 80, 1329, 644);
		contentPane.add(splitPane);

		// int num = Integer.parseInt(text.getText());

		JPanel panelDatos = new JPanel();
		splitPane.setLeftComponent(panelDatos);
		panelDatos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelDatos.setLayout(null);

		JSpinner spinnerApoyos = new JSpinner();
		spinnerApoyos.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerApoyos.setBounds(221, 126, 48, 20);
		panelDatos.add(spinnerApoyos);
		spinnerApoyos.setValue(1);

		JLabel lblNumeroDeApoyos = new JLabel("Numero de apoyos adicionales:");
		lblNumeroDeApoyos.setBounds(27, 129, 177, 14);
		panelDatos.add(lblNumeroDeApoyos);

		JPanel panelApoyos = new JPanel();
		panelApoyos.setBounds(5, 155, 264, 340);
		panelDatos.add(panelApoyos);

		FormLayout fl_panelApoyos = new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("78dlu"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(26dlu;default)"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("51dlu"), },
				new RowSpec[] { FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, });
		fl_panelApoyos.setColumnGroups(new int[][] { new int[] { 1, 3, 5 } });
		fl_panelApoyos.setColumnGroup(new int[] { 1, 3, 5 });
		panelApoyos.setLayout(fl_panelApoyos);

		// Panel Datos Cargas

		JPanel panelCargas = new JPanel();
		panelCargas.setBounds(296, 120, 295, 279);
		panelDatos.add(panelCargas);

		JLabel lblNumeroDeCargas = new JLabel("Numero de cargas:");
		lblNumeroDeCargas.setBounds(315, 79, 177, 14);
		panelDatos.add(lblNumeroDeCargas);

		JSpinner spinnerCargas = new JSpinner();
		spinnerCargas.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinnerCargas.setBounds(520, 76, 48, 20);
		panelDatos.add(spinnerCargas);
		spinnerCargas.setValue(1);

		FormLayout fl_panelCargas = new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("2dlu"), ColumnSpec.decode("40dlu"), ColumnSpec.decode("0dlu"),
						ColumnSpec.decode("max(27dlu;default)"), ColumnSpec.decode("2dlu"), ColumnSpec.decode("20dlu"),
						ColumnSpec.decode("12dlu"), ColumnSpec.decode("28dlu"), ColumnSpec.decode("2dlu"),
						ColumnSpec.decode("46dlu"), },
				new RowSpec[] { FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, });
		fl_panelCargas.setColumnGroups(new int[][] { new int[] { 1, 3, 5 } });
		fl_panelCargas.setColumnGroup(new int[] { 1, 3, 5 });
		panelCargas.setLayout(fl_panelCargas);

		// insFilas(fl_panelApoyos, 1);

		agregarApoyos(panelApoyos, 3);
		agregarCargas(panelCargas, 1);

		JLabel lblLongitudDeLa = new JLabel("Longitud de la viga:");
		lblLongitudDeLa.setBounds(27, 76, 131, 14);
		panelDatos.add(lblLongitudDeLa);

		JTextField longViga = new JTextField();

		longViga.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				validarNumeros(evt);
			}

			@Override
			public void keyReleased(KeyEvent evt) {
				labelValDist2.setText(longViga.getText());
			}
		});

		longViga.setBounds(155, 73, 48, 20);
		panelDatos.add(longViga);

		JLabel lblMetros = new JLabel("metros");
		lblMetros.setBounds(223, 76, 46, 14);
		panelDatos.add(lblMetros);

		JLabel lblDatosRequeridos = new JLabel("Datos Requeridos");
		lblDatosRequeridos.setFont(new Font("Arial", Font.BOLD, 20));
		lblDatosRequeridos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosRequeridos.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblDatosRequeridos.setBounds(217, 11, 184, 30);
		panelDatos.add(lblDatosRequeridos);

		// **** Lineas de separacion Panel Datos ****

		JLabel label = new JLabel("1");
		label.setEnabled(false);
		label.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label.setBounds(292, 60, 1, 450);
		panelDatos.add(label);

		JLabel label_1 = new JLabel("1");
		label_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_1.setBounds(18, 110, 275, 1);
		panelDatos.add(label_1);

		JLabel label_2 = new JLabel("1");
		label_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_2.setBounds(306, 410, 285, 1);
		panelDatos.add(label_2);

		JLabel label_3 = new JLabel("1");
		label_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_3.setBounds(18, 510, 275, 1);
		panelDatos.add(label_3);

		// Cuando el spinner de los apoyos tiene algun cambio

		spinnerApoyos.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int s = (Integer) spinnerApoyos.getValue();
				System.out.println("Valor Spinner:" + s);
				panelApoyos.removeAll();
				// panelApoyos.setBounds(15, 128, 209, 25 * s);
				arrayTextApoyos.clear();
				agregarApoyos(panelApoyos, s + 2);
				panelApoyos.updateUI();

			}
		});

		spinnerCargas.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				int s = (Integer) spinnerCargas.getValue();
				System.out.println("Valor Spinner:" + s);
				panelCargas.removeAll();
				arrayTextValCargas.clear();
				arrayTextPosCargas.clear();
				agregarCargas(panelCargas, s);
				panelCargas.updateUI();
			}
		});

		JLabel labelValor = new JLabel();
		labelValor.setHorizontalAlignment(SwingConstants.CENTER);
		labelValor.setHorizontalTextPosition(SwingConstants.CENTER);
		labelValor.setPreferredSize(new Dimension(60, 25));
		labelValor.setText("Valor");
		panelCargas.add(labelValor, "4,2");

		JLabel labelPosicion = new JLabel();
		labelPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		labelPosicion.setHorizontalTextPosition(SwingConstants.CENTER);
		// labelPosicion.setPreferredSize(new Dimension(60, 25));
		labelPosicion.setText("Posicion");
		panelCargas.add(labelPosicion, "8,2");
		
		JLabel lblReacciones = new JLabel("Solucion:");
		lblReacciones.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblReacciones.setBounds(315, 416, 131, 20);
		panelDatos.add(lblReacciones);
		lblReacciones.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(325, 447, 243, 129);
		panelDatos.add(scrollPane);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Apoyo", "Reaccion [kN]"
			}
		));
		scrollPane.setViewportView(table);
		scrollPane.setVisible(false);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		

		JPanel panelGrafico = new JPanel();
		splitPane.setRightComponent(panelGrafico);
		panelGrafico.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelGrafico.setLayout(null);

		JLabel labelGrafico = new JLabel("");
		labelGrafico.setBounds(10, 11, 705, 611);
		panelGrafico.add(labelGrafico);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Diseno.class.getResource("/ui/BEAMSpngII.png")));
		lblNewLabel.setBounds(104, 149, 554, 364);
		panelGrafico.add(lblNewLabel);
		splitPane.setDividerLocation(600);
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					
					ArrayList<Integer> apoyosInt = leerJText(arrayTextApoyos);
					ArrayList<Integer> cargaPosInt = leerJText(arrayTextPosCargas);
					ArrayList<Integer> cargaValInt = leerJText(arrayTextValCargas);
					
					ArrayList<Double> apoyos = new ArrayList<>();
					ArrayList<Double> cargaPos = new ArrayList<>();
					ArrayList<Double> cargaVal = new ArrayList<>();
					apoyos.add((double) 0);
					for (int i = 0; i<apoyosInt.size();i++) {
						apoyos.add(Double.valueOf(apoyosInt.get(i)));
					}
					apoyos.add(Double.valueOf(longViga.getText()));
					
					for (int i = 0; i<cargaPosInt.size();i++) {
						cargaPos.add(Double.valueOf(cargaPosInt.get(i)));
						cargaVal.add(Double.valueOf(cargaValInt.get(i)));
					}
					ArrayList<Double> respuesta = SMbeams.resolver(apoyos, cargaPos, cargaVal);
					System.out.println("Reacciones");
					for (int i = 0;i<respuesta.size();i++) {
			        	System.out.println(respuesta.get(i));
			        }
					
					char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
					DecimalFormat numberFormat = new DecimalFormat("0.00"); 
					for (int i = 0;i<respuesta.size();i++) {
						table.setValueAt(letras[i], i,0);
						table.setValueAt(numberFormat.format(respuesta.get(i)), i,1);
					}
					lblReacciones.setVisible(true);
					scrollPane.setVisible(true);
				
				
				
			}
		});
		btnResolver.setBounds(1066, 23, 89, 23);
		contentPane.add(btnResolver);

		btnDibujar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				// Nombre del primer apoyo (A)

				if (longViga.getText().equals("")) {

					JOptionPane.showMessageDialog(rootPane, "   Ingrese la longitud de la viga!   ");
					return;
					// leerDistApoyos();

				} else {
					if (datosValidos(arrayTextApoyos, Integer.parseInt(longViga.getText()))
							&& datosValidos(arrayTextPosCargas, Integer.parseInt(longViga.getText()))
							&& datosValidos(arrayTextValCargas, 99999999)) {

//						crearGrafico(longViga);

//						try {
//							
//				        	File file = new File("src/graficos/grafico.png");
//				            ImageIO.write(crearGrafico(longViga), "png", file);
//				          
//				        } catch (IOException ex) {
//				        	System.out.println("Error :(");
//				           
//				        }					

						ImageIcon grafico = new ImageIcon(crearGrafico(longViga));
						ImageIcon imagen = new ImageIcon(grafico.getImage().getScaledInstance(labelGrafico.getWidth(),
								labelGrafico.getHeight(), Image.SCALE_DEFAULT));
						labelGrafico.setIcon(imagen);

					} else {

						return;

					}

				}
			}
		});

	}

	// Los valores que tengan los JTextField del arreglo ingresado, los agrega a un
	// arreglo de enteros

	public ArrayList<Integer> leerJText(ArrayList<JTextField> array) {
		ArrayList<Integer> arrayValText = new ArrayList<Integer>();
		int s = array.size();
		for (int i = 0; i < s; i++) {
			arrayValText.add(Integer.parseInt(array.get(i).getText()));
		}
		return arrayValText;
		//arrayTextApoyos
		//arrayTextPosCargas
		//arrayTextValCargas
	}

	ArrayList<JTextField> arrayTextApoyos = new ArrayList<JTextField>();

	JLabel labelValDist2 = new JLabel("L");

	public void agregarApoyos(JPanel panel, int num) {

		int l = 2;

		for (int i = 0; i < num; i++) {
			String pos[] = { "2,", "4,", "6," };
			for (int j = 0; j < pos.length; j++) {
				pos[j] = pos[j] + Integer.toString(i + l);
				System.out.println(pos[j]);
			}

			l++;

			JLabel labelPosicionAP = new JLabel();
			labelPosicionAP.setHorizontalAlignment(SwingConstants.CENTER);
			labelPosicionAP.setHorizontalTextPosition(SwingConstants.CENTER);
			labelPosicionAP.setPreferredSize(new Dimension(60, 25));
			labelPosicionAP.setText("Posicion Apoyo " + (char) (65 + i) + ":");
			panel.add(labelPosicionAP, pos[0]);

			if (0 < i && i < num - 1) {
				JTextField text = new JTextField();
//				text.setPreferredSize(new Dimension(15,25));
				text.setHorizontalAlignment(SwingConstants.LEFT);
				panel.add(text, pos[1]);
				arrayTextApoyos.add(text);

				text.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent evt) {
						validarNumeros(evt);
					}
				});
			} else {
				if (0 == i) {
					JLabel labelValDist1 = new JLabel("0");
					labelValDist1.setHorizontalAlignment(SwingConstants.CENTER);
					labelValDist1.setHorizontalTextPosition(SwingConstants.CENTER);
					// labelValDist.setPreferredSize(new Dimension(15,25));
					panel.add(labelValDist1, pos[1]);
				} else {
					labelValDist2.setHorizontalAlignment(SwingConstants.CENTER);
					labelValDist2.setHorizontalTextPosition(SwingConstants.CENTER);
					// labelValDist.setPreferredSize(new Dimension(15,25));
					panel.add(labelValDist2, pos[1]);
				}

			}

			JLabel labelMetros = new JLabel("metros");
			labelMetros.setHorizontalAlignment(SwingConstants.LEFT);
			labelMetros.setHorizontalTextPosition(SwingConstants.LEFT);
//			labelMetros.setPreferredSize(new Dimension(3,25));

			panel.add(labelMetros, pos[2]);

//			int num = Integer.parseInt(text.getText());

			// System.out.println(arrayTextApoyos);
		}

	}

	ArrayList<JTextField> arrayTextValCargas = new ArrayList<JTextField>();
	ArrayList<JTextField> arrayTextPosCargas = new ArrayList<JTextField>();
	private final JSplitPane splitPane = new JSplitPane();
	private JTable table;

	// Crea los Jlabels y JTexts donde se van a ingresar los datos de las cargas

	public void agregarCargas(JPanel panel, int num) {

		int l = 4;

		for (int i = 0; i < num; i++) {

			String pos[] = { "2,", "4,", "6,", "8,", "10," };

			for (int j = 0; j < pos.length; j++) {
				pos[j] = pos[j] + Integer.toString(i + l);
				System.out.println(pos[j]);
			}

			l++;

			JLabel labelCarga = new JLabel();
			labelCarga.setHorizontalAlignment(SwingConstants.CENTER);
			labelCarga.setHorizontalTextPosition(SwingConstants.CENTER);
			labelCarga.setPreferredSize(new Dimension(60, 25));
			labelCarga.setText("Carga " + (char) (65 + i) + ":");
			panel.add(labelCarga, pos[0]);

			JTextField textValor = new JTextField();
//			text.setPreferredSize(new Dimension(15,25));
			textValor.setHorizontalAlignment(SwingConstants.LEFT);
			panel.add(textValor, pos[1]);
			arrayTextValCargas.add(textValor);

			textValor.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent evt) {
					validarNumeros(evt);
				}
			});

			JLabel labelKN = new JLabel();
			labelKN.setHorizontalAlignment(SwingConstants.CENTER);
			labelKN.setHorizontalTextPosition(SwingConstants.CENTER);
//			labelPosicion.setPreferredSize(new Dimension(60, 25));
			labelKN.setText("kN");
			panel.add(labelKN, pos[2]);

			JTextField textPosicion = new JTextField();
//			text.setPreferredSize(new Dimension(15,25));
			textPosicion.setHorizontalAlignment(SwingConstants.LEFT);
			panel.add(textPosicion, pos[3]);
			arrayTextPosCargas.add(textPosicion);

			textPosicion.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent evt) {
					validarNumeros(evt);
				}
			});

			JLabel labelMetros = new JLabel("metros");
			labelMetros.setHorizontalAlignment(SwingConstants.LEFT);
			labelMetros.setHorizontalTextPosition(SwingConstants.LEFT);
//			labelMetros.setPreferredSize(new Dimension(3,25));
			panel.add(labelMetros, pos[4]);

//			int num = Integer.parseInt(text.getText());

			// System.out.println(arrayTextApoyos);
		}

	}

	// Retorna la posicion de un elemento (Carga o Apoyo) con relacion a la longitud
	// de la viga

	public int posElem(int posElem, JTextField viga) {

		int longViga = Integer.parseInt(viga.getText());
		int pos = 650 * posElem / longViga;
		return pos;
	}

	public void validarNumeros(KeyEvent evt) {

		char validar = evt.getKeyChar();

		if (Character.isLetter(validar)) {
			getToolkit().beep();
			evt.consume();
		}

	}

	public boolean datosValidos(ArrayList<JTextField> array, int longViga) {
		int s = array.size();

		for (int i = 0; i < s; i++) {
			if (array.get(i).getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "   Asegurese de ingresar todos los datos!   ");
				return false;
			} else {
				if (Integer.parseInt(array.get(i).getText()) > longViga) {
					JOptionPane.showMessageDialog(rootPane, "   Revise los Datos Ingresados!   ");
					return false;
				}
			}
		}

		return true;

	}

	public BufferedImage crearGrafico(JTextField longViga) {

		BufferedImage bufferedImage = new BufferedImage(720, 600, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = bufferedImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.white);
		g2.fillRect(0, 0, 720, 600);

		// Lo que se va a pintar

		Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
		Grafico apoyo = new Apoyo();
		Grafico viga = new Viga();
		Grafico carga = new Carga();
		Cota cotas = new Cota();

		Font font = new Font("Arial Narrow", Font.BOLD, 17);
		g.setFont(font);
		g.setColor(Color.BLACK);

		g.drawString("A", 30, 385);

		int tamArrayAp = arrayTextApoyos.size();

		for (int i = 0; i < tamArrayAp; i++) {

			int posApoyo = posElem(leerJText(arrayTextApoyos).get(i), longViga);

			g.drawString("" + (char) (66 + i), posApoyo + 30, 385);

		}

		int tamArrayCar = arrayTextPosCargas.size();

		for (int i = 0; i < tamArrayCar; i++) {

			int posCarga = posElem(leerJText(arrayTextPosCargas).get(i), longViga);
			int valCarga = leerJText(arrayTextValCargas).get(i);

			g.drawString(valCarga + " kN", posCarga + 20, 260);

		}

		// Nombre del ultimo Apoyo (...C,D,E...)

		g.drawString("" + (char) (66 + tamArrayAp), 680, 385);

		for (int i = 0; i < tamArrayAp; i++) {

			int posApoyo = posElem(leerJText(arrayTextApoyos).get(i), longViga);
			apoyo.dibujar(g, posApoyo);
			cotas.cotaApoyo(g, 20 * i, posApoyo, leerJText(arrayTextApoyos).get(i) + " m");
		}

		for (int i = 0; i < tamArrayCar; i++) {

			int posCarga = posElem(leerJText(arrayTextPosCargas).get(i), longViga);
			carga.dibujar(g, posCarga);
			cotas.cotaCarga(g, 20 * -i, posCarga, leerJText(arrayTextPosCargas).get(i) + " m");
		}

		apoyo.dibujar(g, posElem(0, longViga));

		apoyo.dibujar(g, posElem(Integer.parseInt(longViga.getText()), longViga));

		viga.dibujar(g, 650);

		g2.dispose();
		return bufferedImage;
	}
}
