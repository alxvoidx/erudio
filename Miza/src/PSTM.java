import javax.swing.table.*;

/**
 * GUI Tabela
 * @name PSTM.java
 * @author meow
 */
public class PSTM extends DefaultTableModel{
	//konstruktor
	public PSTM(){
		//Klice konstruktor nadrazreda
		super();
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		//Dodamo naslovno vrstico
		 //Ustvarimo staticen seznam ovjektov
		 Object[] vrstica = new Object[]{"Znamka test","Stopnja test"};
		//Dodamo vrstico v tabelo
		addRow(vrstica);
	}
	 
	/**
	 * Metoda ki doda pivsko steklenico na seznam in v tabelo
	 * @param ps - PivskaSteklenica
	 */
	public void addPivskaSteklenica(PivskaSteklenica ps){
		 //Ustvarimo staticen seznam ovjektov
		 Object[] vrstica = new Object[]{ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		//Dodamo vrstico v tabelo
		addRow(vrstica);
	 }
}