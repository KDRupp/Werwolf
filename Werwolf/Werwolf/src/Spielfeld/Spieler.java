/**
 * 
 */
package Spielfeld;

/**
 * @author ZOHGEIGE
 *
 */
public class Spieler extends Thread implements Runnable {
	
	String name;
	public Spieler (String name) {
		this.name = name;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1; i<1000; i++) {
			System.out.println(name + " " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
