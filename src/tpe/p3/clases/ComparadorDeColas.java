package tpe.p3.clases;

import java.util.Comparator;

public class ComparadorDeColas implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cola cola1 = (Cola) o1;
		Cola cola2 = (Cola) o2;
		
		if (cola1.getCantElementos()==cola2.getCantElementos())
			return 0;
		
		if (cola1.getCantElementos()<cola2.getCantElementos())
			return -1;
		else 
			return 1;
		
	}
	
}
