package tpe.p1.clases;

public class Azar extends ColaMultiple {

	private Cola getColaAzar(){
		//obtiene una cola al azar de las presentes en la lista del padre
		int numeroAzar = (int) (Math.random() * elementos.size());
		return elementos.get(numeroAzar);
	}
	
	@Override
	public void agregar(Object o) {
		getColaAzar().agregar(o);
		//si resulta (al azar) CT, agrega en ella
		//si resulta (al azar) CM, se dara recursividad
	}

	@Override
	public Object obtener() {
		return getColaAzar().obtener();
		//si resulta (al azar) CT, obtiene elemento de esa cola
		//si resulta (al azar) CM, se dara recursividad
	}

}
