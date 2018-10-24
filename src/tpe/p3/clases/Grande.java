package tpe.p3.clases;

import java.util.Collections;
import java.util.List;

public class Grande extends Estrategia {

	@Override
	public Cola getCola(List<Cola> elems) {
		return Collections.max(elems, new ComparadorDeColas());
	}

}
