import java.util.Comparator;

enum Kuvio {
	KOLMIO(3),
	NELIÖ(4),
	VIISIKULMIO(5),
	KASIKULMIO(8),
	YMPYRÄ(Double.POSITIVE_INFINITY);
	
	Kuvio(double a) {kulmat = a;}
	Double kulmat;
}
enum Väri {
	SININEN,
	PUNAINEN,
	VIHREÄ,
	KELTAINEN
}
class Kulmamäärä implements Comparator<Kuvio> {
	public int compare(Kuvio a, Kuvio b) {
		if ( a.kulmat >= b.kulmat) {
			return a.compareTo(b);
		};
		return 0;
	}
}
	

	
	





