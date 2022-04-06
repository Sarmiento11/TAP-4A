package e1Ventana;
import static java.awt.Font.PLAIN;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends Frame implements ActionListener {
	//btn 
	Button aceptar;
	TextField txt;
	//Panel
	Panel centro;
	//TextArea
	TextArea resultado;
	
	//Constructor 
	public Ventana () {
		//num(txt);
		//Instanciar
		aceptar= new Button("       Aceptar");
		txt = new TextField ("");
		centro= new Panel();

		resultado= new TextArea("");
		
		//AQUI MODIFIQUE
		aceptar.addActionListener(this);

		centro.setLayout(new BorderLayout());
		
		//Posicion del Panel de texto
		centro.add(txt, BorderLayout.NORTH);
		//Posiones de los botones
		centro.add(aceptar, BorderLayout.CENTER);


		this.setLayout(new BorderLayout());
		this.add(resultado, BorderLayout.CENTER);

		
		//Posiones de los paneles 
		this.add(centro, BorderLayout.NORTH);		
		
	    aceptar.setFocusable(false);
	    aceptar.setBackground(Color.GREEN); //Color de fondo
	    aceptar.setForeground(Color.BLACK); //Color de la letra
	    
	    //Diseño del textField
	    txt.setBackground(Color.BLUE); //Color del fondo
	    txt.setForeground(Color.WHITE);//Color de la letra
	    
		setSize(600, 400); //Dimensiones del JFrame
        setVisible(true); //Mostrar JFrame
       
        cerrarVentana(); //Método cerrar ventana
       
	}
	
	public static void main(String args[]){
		Ventana v= new Ventana();
	}	

	//Método 
	//Cerrar la ventana 
	public void cerrarVentana() {
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	//Aceptar solo num
	private void num(TextField a) {
		a.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c= e.getKeyChar();
				if(!Character.isDigit(c) && c!='.') {
					e.consume();
				}
				if(c== '.' && txt.getText().contains(".")) {
					e.consume();
				}
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String c= txt.getText();
	 	if (e.getSource() == aceptar) {
			 resultado.append(c + "\n");
		}
	}	
}
