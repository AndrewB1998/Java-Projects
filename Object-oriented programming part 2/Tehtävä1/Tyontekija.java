
public class Tyontekija extends Etaisyys {
	private String id;
	private String nimi;
	private String sposti;
	
	/** Id 8 ja välillä 0-99999999
	 * @pre nimi != null && id != null && sposti != null
	 * 		id length == 8 && id = 00000000-99999999
	 * @post getId().equals(id) && getNimi().equals(nimi) && getSposti().equals(sposti)
	 */

	public Tyontekija(String id, String nimi, String sposti) {
		this.id = id;
		this.nimi = nimi;
		this.sposti = sposti;
	}
 // Luodaan asetus- ja palautusmetodit työntekijän tietojen asettamiseksi;
	/**
	 * @pre id != null
	 * @post RESULT == id */
	public String getId() {
		return id;
	}
	/**
	 * @pre id != null
	 * @post getId().equals(id) */
	public void setId(String id) {
		if (Integer.valueOf(id) >= 0 && Integer.valueOf(id) <= 99999999 && id.length() == 8) {
		this.id = id;}
		else {System.out.println("Arvo ei vastaa ehtoja");
		}
	}
	/**
	 * @pre nimi != null
	 * @post RESULT == nimi */
	public String getNimi() {
		return nimi;
	}
	

	/**
	 * @pre nimi != null
	 * @post getNimi().equals(nimi) */	
	public void setNimi(String nimi) {
		if (nimi != null) {
		this.nimi = nimi;
	} else {System.out.print("Arvo ei vastaa ehtoja");
	}
	}
	/**
	 * @pre sposti != null
	 * @post RESULT == sposti */
	public String getSposti() {
		return sposti;
	}
	/**
	 * @pre sposti != null
	 * @post getSposti().equals(sposti) */
	public void setSposti(String sposti) {
		if (sposti != null) {
			this.sposti = sposti;
		} else {System.out.print("Arvo ei vastaa ehtoja");
		}
	}
	
	}

	

