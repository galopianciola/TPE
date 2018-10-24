package tpe.p1.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ColaMultiple extends Cola{
	protected List<Cola> elementos = new ArrayList<Cola>();

	@Override
	public int getCantElementos(){
		
		int contador = 0;
		
		for (Cola c : this.elementos){
			contador += c.getCantElementos();
		}
		
		return contador;
	}
	
	public void agregarCola(Cola c){
		this.elementos.add(c);
	}
	
	@Override
	public ColaTerminal mayorColaTerminal(){
		//de todas las colas, analizar las terminales y quedarse con la mayor
		
		int cantMayorCola = -1;
		Cola mayorCola = null;
		
		for (Cola c : this.elementos) {
			Cola aux=c.mayorColaTerminal();
			
			if (aux.getCantElementos() > cantMayorCola){
				cantMayorCola = aux.getCantElementos();
				mayorCola = aux;
			}
				
		}
		
		return (ColaTerminal) mayorCola;
	}
	
	@Override
	public int cantColasTerminales(){

		int contador = 0;
		
		for (Cola c : this.elementos){
			contador += c.cantColasTerminales();
		}
		
		return contador;
	}
}
