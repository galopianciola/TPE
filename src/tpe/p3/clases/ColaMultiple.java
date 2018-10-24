package tpe.p3.clases;

import java.util.ArrayList;
import java.util.List;

public class ColaMultiple extends Cola{
	private List<Cola> elementos = new ArrayList<Cola>();
	private Estrategia estrategiaAdd;
	private Estrategia estrategiaGet; 
	
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
	public void agregar(Object o){
		//le doy mi cola de colas a la estrategia (azar o intercalado)
		//con su criterio, me devuelve una cola
		//agrego en ella
		
		this.estrategiaAdd.getCola(this.elementos).agregar(o);
	}
	
	@Override
	public Object obtener(){
		//le doy mi cola de colas a la estrategia (azar o intercalado)
		//con su criterio, me devuelve una cola
		//agrego en ella
				
		return this.estrategiaGet.getCola(this.elementos).obtener();
	}
	
	public int getSize(){
		return this.elementos.size();
	}
	
	@Override
	public ColaTerminal mayorColaTerminal(){
		//de todas las colas, preguntarle a todas cual es la mayor ColaTerminal que
		//posee (o es)
		
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
	
	public void setEstrategia(Estrategia add, Estrategia get){
		this.estrategiaAdd=add;
		this.estrategiaGet=get;
	}
}
