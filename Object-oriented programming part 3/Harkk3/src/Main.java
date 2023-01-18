
public class Main {

	public static void main(String[] args) {
		var testi1 = new Lukuvali<>(1,5); // luodaan paikalliset testimuuttujat
		var testi2 = new Lukuvali<>(2,3	);
		var testi3 = new Lukuvali<>(1.3,5.6); //demonstraatio, että laskutoimitukset toimivat myös float ja double tyyppisillä arvoilla
		var testi4 = new Lukuvali<>(2.313131313131,3.45454545454545);
		System.out.println(Lisaa.lisaa(testi1,testi2));
		System.out.println(Kerro.kerro(testi1,testi2) );
		System.out.println(Lisaa.lisaa(testi3,testi4) );
		System.out.println(Kerro.kerro(testi3,testi4) );
		
		VäritettyKuvio sinikasi = new VäritettyKuvio(Kuvio.KASIKULMIO,Väri.SININEN);
		VäritettyKuvio punakolmio = new VäritettyKuvio(Kuvio.KOLMIO,Väri.KELTAINEN);
		Kulmamäärä a = new Kulmamäärä();
		System.out.println(a.compare(Kuvio.KASIKULMIO,Kuvio.NELIÖ));
		
	}

}
