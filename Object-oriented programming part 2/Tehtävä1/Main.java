import java.util.*;
public class Main {
	/**
	 * @pre Tyontekijoita <= 1000
	 * @param args
	 */
	public static void main(String[] args) {
		//Työntekijä olion luonti
		Tyontekija Jarmo = new Tyontekija("00123037", "Jarmo","jarmo@gmail.com"); 
		Tyontekija Markus = new Tyontekija("02123037", "Markus","markus@gmail.com");
		Tyontekija Touko = new Tyontekija("00145237", "Touko","touko@gmail.com");
		Tyontekija Seppo = new Tyontekija("12345678", "Seppo","seppo@gmail.com");
		Tyontekija Luukas = new Tyontekija("13131313","Luukas","luukas@gmail.com");
		
		//Työntekijän lisääminen pohjapiirrustukseen
		Paikka Jarmonpaikka = new Paikka('D',"24");
		Paikka Luukaksenpaikka = new Paikka('S',"12");
		Toimisto.setTyontekija(Jarmo, Jarmonpaikka);
		
		//Tai seuraavasti
		Toimisto.setTyontekija(Markus,new Paikka('A',"2"));
		Toimisto.setTyontekija(Touko,new Paikka('A',"8"));
		Toimisto.setTyontekija(Seppo,new Paikka('X',"82"));
		
		//Työntekijän siirtäminen pohjapiirroksessa 
		Toimisto.siirtoTyontekija(Jarmo,Jarmonpaikka, new Paikka('C',"13"));
		
		//Työntekijän poisto pohjapiirroksesta
		Toimisto.poistaTyontekija("Seppo");
		
		//Työntekijän haku nimellä tai ID:llä
		Toimisto.getTyontekija("Touko");
		Toimisto.getTyontekija("12345678");
		Toimisto.getTyontekija("Jarmo");
		
		//toimiston pohjapiirroksen tulostus
		Toimisto.printBoard(Toimisto.kartta);
		
		//Kahden työntekijän etäisyys
		System.out.println(Etaisyys.etaisyys(Jarmonpaikka,Luukaksenpaikka));
		System.out.println(Etaisyys.etaisyys(new Paikka('A',"1"), new Paikka('A',"3")));
	}
}
