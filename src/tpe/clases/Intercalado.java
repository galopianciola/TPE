package tpe.clases;


public class Intercalado extends ColaMultiple {

	private int ultimoIndice = -1;
	//Guarda la ultima posicion utilizada de la cola.
	//Inicializa en -1 para partir desde 0.
	
	@Override
	public void agregar(Object o) {
		//Obtengo la cola que me indica el numero
		Cola c = super.elementos.get(this.ultimoIndice+1);
		
		c.agregar(o);
		this.ultimoIndice++;
		
		//si es CT, obtiene de ella
		//si es CM, se dara recursividad
	}

	@Override
	public Object obtener() {
		//Obtengo la cola que me indica el numero
		Cola c = super.elementos.get(this.ultimoIndice+1);
		
		this.ultimoIndice++;
		return c.obtener();
		
		//si es CT, obtiene de ella
		//si es CM, se dara recursividad
	}

}
