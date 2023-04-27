/**
 * 
 */
package Spielfeld;

/**
 * @author ZOHGEIGE
 *
 */
public class Spielfeld_Nacht {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hexe malena = new Hexe ("Malena");
		malena.start();
		
		Spieler s1 = new Spieler ("Hugo");
		s1.start();

	}

}
