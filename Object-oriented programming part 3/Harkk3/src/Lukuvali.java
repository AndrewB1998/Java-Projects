// geneerinen luokka lukuvälille
public class Lukuvali<vali1,vali2> {
	vali1 data1;
	vali2 data2;
	Lukuvali(vali1 d, vali2 c) {data1 = d; data2 = c;}


public vali1 getEka() {return data1;}
public vali2 getToka() {return data2;}
public void setEka(vali1 e) {data1 = e;}
public void setToka(vali2 e) {data2 = e;}


}



