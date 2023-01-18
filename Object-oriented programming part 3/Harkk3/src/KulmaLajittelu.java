import java.util.Comparator;

 	
public class KulmaLajittelu implements Comparable<Kuvio> {

	@Override
	public int compareTo(Kuvio o) {
		int tulos = this.kulmat.compareTo(o.kulmat);
		if (tulos != 0) return tulos;
	}
}