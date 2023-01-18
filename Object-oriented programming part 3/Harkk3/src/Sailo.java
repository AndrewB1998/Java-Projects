import java.util.Arrays;
public class Sailo {
		private final int[] data; 
	    Sailo(int[] syöte) {
	    	data = syöte;
	    	for (int i = 0; i<syöte.length; i++) {
	    		assert syöte[i] <= syöte[i+1]; 
	    	}
	    }
	    
	    
	    boolean sisältää(int arvo) {
	        return Arrays.stream(data).anyMatch(x -> x == arvo);
	    }
	    
	    int koko() {
	        return data.length;
	    }
	    
	    //@.privateClassInvariant
	      //FORALL(i: 0 <= i < data.length;
	        //FORALL(j: i < j < data.length; data[i] <= data[j]))
	}



