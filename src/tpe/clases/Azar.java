package tpe.clases;

public class Azar extends ColaMultiple {

	public Cola getColaAzar(){
		//obtiene una cola al azar de las presentes en la lista del padre
		int numeroAzar = (int) (Math.random() * super.elementos.size());
		return super.elementos.get(numeroAzar);
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
