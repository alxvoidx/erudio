//Uvozimo pakete za delo z GUI 
import javax.swing.*;
//Uvozimo pakete za delo v dogodki
import java.awt.event.*;


/**
 * App za graf.uporab.vmesnikom za delo s steklenice
 * @name Miza.java
 * @author Orlov Alexander
 */

// Deklariramo javni razred 

public class Miza extends JFrame implements ActionListener{
	
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField znamkaPolje;
	private JTextField alkoholPolje;
	private JTable tabela;
	private PSTM modelTabele;
	
	/**
	 * Decl. javnj staticno metodo in ustvari novj okno
	 * @param args - parametri iz konzole
	 */
	public static void main(String[] args) {
		Miza m = new Miza("Miza s pivskimi steklenicami");
	}
	

	/**
	 * Javni konstruktor
	 * vrne nov objekt tipa Miza
	 * @param n - window name
	 */
	public Miza(String n)
	{
		//klicemo konstruktor nadrazreda
		super(n);
		//Inicializiramo lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj Steklenico");
		znamkaPolje = new JTextField(8);
		alkoholPolje = new JTextField(32);
		modelTabele = new PSTM();
		tabela = new JTable(modelTabele);
		//Povrsino dodamo na mizo
		add(povrsina);
		//Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);		
		//Dodamo gumb vnosna polja in tabelo na povrsino
		povrsina.add(new JLabel("Znamka:"));
		povrsina.add(znamkaPolje);
		povrsina.add(new JLabel("Stopnja Alkohola:"));
		povrsina.add(alkoholPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		//pokazemo okno
		setVisible(true);
		//nastavimo orno
		setSize(800,600);
		//Nastavimo obnasanje krizca (x) - da konca aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Ustvarjam objekt Miza");
		}
		

	/**
	 *  Metoda ki jopredpisue vmesnik ActionLictener in dodaj steklenico v tabelo
	 *  @param ae - dogodek
	 */
	public void actionPerformed(ActionEvent ae){
		System.out.println("Dodajam steklenico...");
		System.out.println("Znamka je:"+znamkaPolje.getText());
		System.out.println("Stonja Alkohola je:" + alkoholPolje.getText());
		//Ustvarimo lokalno spremenljivko flasa
		double d = Double.parseDouble(alkoholPolje.getText());
		PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(), 500, d);
		//Dodamo objekt v seznam
		modelTabele.addPivskaSteklenica(flasa);
	 }
	 
		
	
}