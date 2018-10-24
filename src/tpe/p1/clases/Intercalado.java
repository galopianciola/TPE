package tpe.p1.clases;


public class Intercalado extends ColaMultiple {

	private int ultimoIndice = -1;
	//Guarda la ultima posicion utilizada de la cola.
	//Inicializa en -1 para partir desde 0.
	
	private Cola obtenerIntercalado(){
		//Obtengo la cola que me indica el numero
		this.ultimoIndice++;
		
		if (this.ultimoIndice == elementos.size()) //si llego al final
			this.ultimoIndice=0; //se reinicia
		
		Cola c = elementos.get(this.ultimoIndice);
		
		return c;
	}
	
	@Override
	public void agregar(Object o) {
		
		this.obtenerIntercalado().agregar(o);
		
		//si es CT, obtiene de ella
		//si es CM, se dara recursividad
	}

	@Override
	public Object obtener() {
	
		return this.obtenerIntercalado().obtener();
		
		//si es CT, obtiene de ella
		//si es CM, se dara recursividad
	}

}
