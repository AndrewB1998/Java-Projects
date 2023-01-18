import java.util.ArrayList;

public class Toimisto {
	/** kartta on kooltaan 26x100 ja listat tyhjiä
	 * @pre kartta dimensions == [26][10] 
	 * 		tyontekijat onTyhjä
	 * @post */
	public static String[][] kartta = new String[26][100];
	public static ArrayList<Tyontekija> tyontekijat = new ArrayList<Tyontekija>();
	public static ArrayList<Paikka> paikat = new ArrayList<Paikka>();
	/**
	 * @pre tyontekija EXISTS && paikka EXISTS
	 * 		tyontekija.size() <= 1000
	 * @post RESULT == tyontekija.getId() && tyontekijat.size() >=0 && paikat.size() >=0 */
	public static void setTyontekija(Tyontekija tyontekija, Paikka paikka) {
		int xpos = (paikka.getX() - 'A');
		int ypos = Integer.parseInt(paikka.getY());
		kartta[xpos][ypos] = tyontekija.getId();
		
		if (tyontekijat.size() <= 1000) {
		tyontekijat.add(tyontekija);}
		else {System.out.println("Työntekijöitä jo maksimimäärä (1000)");}
		paikat.add(paikka);
		
	}
	/**
	 * @pre tunniste != null
	 * @post tunniste == tyontekija.getNimi || tunniste == tyontekija.getID 
	 * 		 RESULT == tyontekija.getX + tyontekija.getY */
	public static void getTyontekija(String tunniste) {
		int luku = 0;
		for (Tyontekija t : tyontekijat ) {
			luku = luku + 1;
		if (t.getNimi() == tunniste || t.getId() == tunniste) {
			System.out.println( paikat.get(luku-1).getX() + paikat.get(luku-1).getY());
		}
		}
	}/**
	 * @pre tunniste != null
	 * @post tunniste == tyontekija.getNimi || tunniste == tyontekija.getID
	 * 		 tyontekija DOESN'T EXIST in tyontekijat && paikka DOESN'T EXIST in paikat 
	 * 		 && työntekija.getId() DOESN'T EXIST in kartta */
	public static void poistaTyontekija(String tunniste) {
		int luku = 0;
		for (Tyontekija t : tyontekijat ) {
			if ( t.getNimi() != tunniste) {
		
			luku = luku + 1;
			}
		}
		tyontekijat.remove(luku-1);
		kartta[(paikat.get(luku-1).getX()-'A')][Integer.parseInt(paikat.get(luku-1).getY())] = null;
		paikat.remove(luku-1);
			
	}
	/**
	 * @pre (uusipaikka.getX >= 0 && <= 26) && (uusipaikka.getY >= 0 && <= 100)
	 * 		tyontekija EXISTS
	 * @post tyontekija.getTyontekija != OLD(tyontekija.getTyontekija
	 * 		OLD(tyontekija.getTyontekija() == null */
	public static void siirtoTyontekija(Tyontekija tyontekija, Paikka paikka, Paikka uusipaikka) {
		int xpos = (uusipaikka.getX() - 'A');
		int ypos = Integer.parseInt(uusipaikka.getY());
		kartta[xpos][ypos] = tyontekija.getId();
		kartta[(paikka.getX()-'A')][Integer.parseInt(paikka.getY())] = null;
		tyontekijat.remove(tyontekija); //poistetaan tyontekija kyseiseltä paikaltaan ja lisätään listan perälle
		tyontekijat.add(tyontekija); 
		paikat.remove(paikka);
		paikat.add(uusipaikka);
	}
	 public static void printBoard(String[][] kartta ) {
	        /** Tulostaa toimiston 
	         * @.post true
	         */
	        for (String[] x : kartta) {
	        	for (String y: x) {
	            if(y == null) {
	            	System.out.print("[]");} //kuvataan tyhjää paikkaa "[]"
	            else {
	            	System.out.print("["+y+"]");}
	            }
	        	System.out.println("");
	        }
	 }
}
