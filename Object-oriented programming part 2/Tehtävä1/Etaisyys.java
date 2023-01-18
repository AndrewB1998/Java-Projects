
public class Etaisyys{
	/** etaisyys = sqrt((x1 -x2)*(x1-x2)+(y1-y2)*(y1-y2))
	 *  
	 * @pre (x1, x2, y1, y2) >= 0
	 * 		etaisyys >= 0
	 * @post RESULT == sqrt((x1 -x2)*(x1-x2)+(y1-y2)*(y1-y2)) && etaisyys == double  */
	public static double etaisyys(Paikka paikka1, Paikka paikka2) {
		int x1 = paikka1.getX();
		int x2 = paikka2.getX();
		int y1 = Integer.valueOf(paikka1.getY());
		int y2 = Integer.valueOf(paikka2.getY());
		double etaisyys = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return etaisyys;
		
	}
	

}
