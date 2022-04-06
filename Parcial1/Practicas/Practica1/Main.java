import javax.swing.*;
import java.awt.EventQueue;
public class Main extends JFrame
{
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CalculadoraGUI calc = new CalculadoraGUI("CalculadoraGUI");
					calc.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}