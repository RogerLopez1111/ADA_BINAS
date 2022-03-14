package AdaBinas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Choice;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista1.EDAD();
			}
		});
		btnNewButton.setBounds(64, 237, 141, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCalcularAntiguedad = new JButton("Calcular Antiguedad");
		btnCalcularAntiguedad.setBounds(246, 237, 141, 23);
		contentPane.add(btnCalcularAntiguedad);
		
		JButton btnModificarSalario = new JButton("Modificar salario");
		btnModificarSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NombBusc= textnombre.getText();
				String ApeBusc=textapellido.getText();
				int NuevoSal= Integer.valueOf(JOptionPane.showInputDialog("Ingresa el salario nuevo"));
				lista1.editarLista(NombBusc, ApeBusc, NuevoSal);
			}
		});
		btnModificarSalario.setBounds(115, 212, 116, 18);
		contentPane.add(btnModificarSalario);
		
		textnombre = new JTextField();
		textnombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre=lista1.ultimo.getNombre();
				String apellido=lista1.ultimo.getApellido();
				String genero=lista1.ultimo.getGenero();
				int nacimiento=lista1.ultimo.getNacimiento();
				int ingreso=lista1.ultimo.getIngreso();
				int salario=lista1.ultimo.getSalario();
				textnombre.setText(nombre);
				textapellido.setText(apellido);
				textgenero.setText(genero);
				textnacimiento.setText(String.valueOf(nacimiento));
				textingreso.setText(String.valueOf(ingreso));
				textsalario.setText(String.valueOf(salario));
			}
		});
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NombBusc=JOptionPane.showInputDialog("Nombre");
				String ApeBusc=JOptionPane.showInputDialog("Apellido");
				lista1.irAnodoSiguiente(NombBusc, ApeBusc);
				String nombre=lista1.actual.getNombre();
				String apellido=lista1.actual.getApellido();
				String genero=lista1.actual.getGenero();
				int nacimiento=lista1.actual.getNacimiento();
				int ingreso=lista1.actual.getIngreso();
				int salario=lista1.actual.getSalario();
				textnombre.setText(nombre);
				textapellido.setText(apellido);
				textgenero.setText(genero);
				textnacimiento.setText(String.valueOf(nacimiento));
				textingreso.setText(String.valueOf(ingreso));
				textsalario.setText(String.valueOf(salario));

			}
		});
		btnNewButton_1.setBounds(167, 283, 103, 19);
		contentPane.add(btnNewButton_1);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre= textnombre.getText();
				String apellido=textapellido.getText();
				String genero=textgenero.getText();
				int nacimiento=Integer.valueOf(textnacimiento.getText());
				int ingreso=Integer.valueOf(textingreso.getText());
				int salario= Integer.valueOf(textsalario.getText());
				Empleados nuevo = new Empleados(nombre, apellido, genero,nacimiento,ingreso,salario);
				lista1.InsertarOrdenado(nuevo);
				JOptionPane.showMessageDialog(null, "Agregado");
				limpiacontroles();
			}
		});
		btnAgregar.setBounds(341, 108, 85, 21);
		contentPane.add(btnAgregar);
		
		JButton btnPrint = new JButton("Imprimir");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista1.imprimirLista();
			}
		});
		btnPrint.setBounds(344, 155, 85, 21);
		contentPane.add(btnPrint);
	}
	public void limpiacontroles() {
		textnombre.setText("");
	textapellido.setText("");
	textgenero.setText("");
	textnacimiento.setText("");
	textingreso.setText("");
	textsalario.setText("");}
}
