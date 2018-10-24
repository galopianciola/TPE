package tpe.p2.clases;

import java.util.List;

public class Azar extends Estrategia {

	public Cola getCola(List<Cola> elems){
		//obtiene una cola al azar de las presentes en la lista pasada x parametro
		int numeroAzar = (int) (Math.random() * elems.size());
		return elems.get(numeroAzar);
	}

}
