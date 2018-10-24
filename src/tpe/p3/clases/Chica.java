package tpe.p3.clases;

import java.util.Collections;
import java.util.List;

public class Chica extends Estrategia {

	@Override
	public Cola getCola(List<Cola> elems) {
		return Collections.min(elems, new ComparadorDeColas());
	}

}
