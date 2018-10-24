package tpe.p2.clases;

import java.util.List;

public class Intercalado extends Estrategia {

	private int ultimoIndice = -1;
	//Guarda la ultima posicion utilizada de la cola.
	//Inicializa en -1 para partir desde 0.
	
	public Cola getCola(List<Cola> elems){
		//Obtengo la cola que me indica el numero
		this.ultimoIndice++;
		
		if (this.ultimoIndice == elems.size()) //si llego al final
			this.ultimoIndice=0; //se reinicia
		
		return elems.get(this.ultimoIndice);
	}
	
}
