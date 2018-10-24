package tpe.p3.clases;

import java.util.ArrayList;
import java.util.List;

public class ColaTerminal extends Cola {
	private List<Object> elementos = new ArrayList<Object>();
	
	@Override
	public void agregar(Object o) {
		this.elementos.add(o);
	}

	@Override
	public Object obtener() {
		//devuelvo el elemento de la posicion 0
		//sera siempre el primero esperando en la cola
		//lo devuelvo y lo borro
		Object o = this.elementos.get(0);
		this.elementos.remove(0);
		return o;
	}

	@Override
	public int getCantElementos() {
		
		int contador = 0;
		
		for (Object o : this.elementos)
			contador ++;
		
		return contador;
	}
	
	////////////////////////////////////
	
	public int cantColasTerminales(){
		return 1;
	}
	
	public ColaTerminal mayorColaTerminal(){
		return this;
	}

}
