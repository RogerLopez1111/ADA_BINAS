package AdaBinas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Choice;

public class GUIEmpleados extends JFrame {

	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField textgenero;
	private JTextField textnacimiento;
	private JTextField textingreso;
	private JTextField textsalario;
	private JTable table;
	private operaciones lista1 = new operaciones();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIEmpleados frame = new GUIEmpleados();
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
	public GUIEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 347);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		int kk=0;
		do {
			kk++;
		Empleados nuevo = new Empleados("Nombre"+kk, "apellido"+kk,"Genero"+kk, "nacimiento"+kk,"ingreso"+kk);
				lista1.insertarAlFinal(nuevo);
		}
		while(kk!=4);
		lista1.imprimeLista();
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lupita\\Documents\\OneDrive - Universidad Autonoma de Yucatan\\Cuarto semestre FCA\\POO\\ADA-BINAS\\Logo ada.png"));
		lblNewLabel.setBounds(0, 0, 434, 82);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Datos-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 84, 448, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(10, 101, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido:");
		lblNewLabel_2_1.setBounds(10, 119, 75, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("G\u00E9nero:");
		lblNewLabel_2_2.setBounds(10, 138, 75, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_2_3.setBounds(10, 158, 123, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Fecha de ingreso:");
		lblNewLabel_2_4.setBounds(10, 176, 109, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Salario");
		lblNewLabel_2_5.setBounds(10, 194, 98, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("C\u00E1lculos---------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2_6.setBounds(10, 223, 448, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JButton btnNewButton = new JButton("Calcular edad");
		btnNewButton.setBounds(64, 237, 141, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCalcularAntiguedad = new JButton("Calcular Antiguedad");
		btnCalcularAntiguedad.setBounds(246, 237, 141, 23);
		contentPane.add(btnCalcularAntiguedad);
		
		JButton btnModificarSalario = new JButton("Modificar salario");
		btnModificarSalario.setBounds(115, 212, 116, 18);
		contentPane.add(btnModificarSalario);
		
		textnombre = new JTextField();
		textnombre.setBounds(143, 98, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setColumns(10);
		textapellido.setBounds(143, 116, 86, 20);
		contentPane.add(textapellido);
		
		textgenero = new JTextField();
		textgenero.setColumns(10);
		textgenero.setBounds(143, 135, 86, 20);
		contentPane.add(textgenero);
		
		textnacimiento = new JTextField();
		textnacimiento.setColumns(10);
		textnacimiento.setBounds(143, 155, 86, 20);
		contentPane.add(textnacimiento);
		
		textingreso = new JTextField();
		textingreso.setColumns(10);
		textingreso.setBounds(143, 173, 86, 20);
		contentPane.add(textingreso);
		
		textsalario = new JTextField();
		textsalario.setColumns(10);
		textsalario.setBounds(143, 191, 86, 20);
		contentPane.add(textsalario);
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Lupita\\Documents\\OneDrive - Universidad Autonoma de Yucatan\\Cuarto semestre FCA\\POO\\ADA-BINAS\\Info empleado.png"));
		lblNewLabel_3.setBounds(236, 101, 98, 125);
		contentPane.add(lblNewLabel_3);
		
		table = new JTable();
		table.setBounds(386, 119, 1, 1);
		contentPane.add(table);
		
		JButton btnNewButton_1 = new JButton("Cambiar empleado");
		btnNewButton_1.setBounds(167, 283, 103, 19);
		contentPane.add(btnNewButton_1);
	}
}
