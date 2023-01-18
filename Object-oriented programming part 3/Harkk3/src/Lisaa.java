import java.util.ArrayList;
// Luokka sisältää kolme listaa int, double ja float tyyppisille arvoille ja syöttää arvot esiintymän mukaiseen listaan
public class Lisaa {
	int value1;
	int value2;
	static ArrayList<Integer> list1 = new ArrayList<>();
	static ArrayList<Float> list2 = new ArrayList<>();
	static ArrayList<Double> list3 = new ArrayList<>();
	// parametrien tunnistus instanceof-operaattorin avulla. 
	
	static ArrayList lisaa(Lukuvali eka, Lukuvali toka) {
		if (eka.getEka() instanceof Integer) {
			//Operaattorien ylikuormittamattomuuden vuoksi tulee arvot jäsentää instanssin mukaisesti ja ne palautetaan kun instanceof = true
			 int value1 = Integer.parseInt(eka.getEka().toString()) +Integer.parseInt(toka.getEka().toString()) ; 
			 int value2= Integer.parseInt(eka.getToka().toString()) +Integer.parseInt(toka.getToka().toString()) ;
			 for (int i = value1; i<=value2; i++) {list1.add(i);}
			 return list1;}
		else if(eka.getEka() instanceof Float) {
			 float value1 = Float.parseFloat(eka.getEka().toString()) +Float.parseFloat(toka.getEka().toString()) ;
			 float value2= Float.parseFloat(eka.getToka().toString()) +Float.parseFloat(toka.getToka().toString()) ;
			 for (float i = value1; i<=value2; i++) {list2.add(i);}
			 return list2;}
		else {
			 double value1 = Double.parseDouble(eka.getEka().toString()) +Double.parseDouble(toka.getEka().toString()) ;
			 double value2= Double.parseDouble(eka.getToka().toString()) +Double.parseDouble(toka.getToka().toString()) ;
			 for (double i = value1; i<=value2; i++) {list3.add(i);}
			 return list3;}
	}
}
			 


	

