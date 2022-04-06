import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculadoraGUI extends JFrame
{
	private static final long serialVersionUID = 1L;
	public CalculadoraGUI(String nombre)
	{ 
		super(nombre);
		init();
                this.setTitle("Calculadora Simple");	
	}    
	public void init()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(500,400);
		btn0 = new JButton("0");
		btn1 = new JButton("1");              
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnSuma = new JButton("+");
		btnResta = new JButton("-");
		btnMult = new JButton("*");
		btnDivision = new JButton("/");
		btnExp = new JButton("^");
		btnIgual = new JButton("=");
		lb1 = new JLabel("C1");  
		lb2 = new JLabel("C2");
		lb3 = new JLabel("C3");
		lb4 = new JLabel("Op");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();     
         
		txt = new JTextField(100);
		txt.setText("1234567890");
                //SE LE DA COLOR A LA FUENTE
                txt.setForeground(Color.GRAY);
		this.setLayout(new BorderLayout());
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		p1.setLayout(new GridLayout(1,2,1,1));
		p1.add(txt);
		p2.setLayout(new GridLayout(5,4,2,2));
		p2.add(lb1);
		p2.add(lb2);
		p2.add(lb3);
		p2.add(lb4);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btnSuma);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btnResta);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btnDivision);
		p2.add(btnMult);
		p2.add(btn0);
		p2.add(btnExp);
		p2.add(btnIgual);
                btn0.setBackground(java.awt.Color.LIGHT_GRAY);
                btn1.setBackground(java.awt.Color.LIGHT_GRAY);
                btn2.setBackground(java.awt.Color.LIGHT_GRAY);
                btn3.setBackground(java.awt.Color.LIGHT_GRAY);
                btn4.setBackground(java.awt.Color.LIGHT_GRAY);
                btn5.setBackground(java.awt.Color.LIGHT_GRAY);
                btn6.setBackground(java.awt.Color.LIGHT_GRAY);
                btn7.setBackground(java.awt.Color.LIGHT_GRAY);
                btn8.setBackground(java.awt.Color.LIGHT_GRAY);
                btn9.setBackground(java.awt.Color.LIGHT_GRAY);
                btnSuma.setBackground(java.awt.Color.LIGHT_GRAY);
                btnResta.setBackground(java.awt.Color.LIGHT_GRAY);
                btnExp.setBackground(java.awt.Color.LIGHT_GRAY);
                btnIgual.setBackground(java.awt.Color.LIGHT_GRAY);
                btnMult.setBackground(java.awt.Color.LIGHT_GRAY);
                btnDivision.setBackground(java.awt.Color.LIGHT_GRAY);
                
		btn0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"0");
			}
		});
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"1");
			}
		});
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"2");
			}
		});

		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"3");
			}
		});

		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"4");
			}
		});

		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"5");
			}
		});

		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"6");
			}
		});

		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"7");
			}
		});

		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"8");
			}
		});

		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"9");
			}
		});

		btnDivision.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"/");
			}
		});

		btnMult.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"*");
			}
		});

		btnSuma.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"+");
			}
		});

		btnResta.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"-");
			}
		});

		btnExp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txt.setText(txt.getText()+"^");
			}
		});

		btnIgual.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ope = txt.getText();
				Listas_ED exArit=new Listas_ED();
				String preparado=exArit.preparaCadena(ope);
				exArit.llenaLista(preparado);
				boolean a=exArit.valida();
				if (a==true)
				{
					exArit.resolver(a);
					String resu=exArit.resolver(a);
					txt.setText("");
					txt.setText(txt.getText()+resu);
				}
				else
				{
					txt.setText(txt.getText()+"operacion no valida");
				}
					
			}
		});
	}
	
	JButton btn1, btn2, btn3, btn4,btn5, btn6,btn7,btn8,btn9,btn0,btnSuma,btnResta,btnMult,btnDivision,btnIgual,btnExp;
	JLabel lb1,lb2,lb3,lb4;
	JTextField txt;
	JPanel p1,p2,p3;
}