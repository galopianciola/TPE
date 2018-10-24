package tpe.p2.clases;

import java.util.ArrayList;
import java.util.List;

public class ColaMultiple extends Cola{
	private List<Cola> elementos = new ArrayList<Cola>();
	private Estrategia estrategia;
	
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
		
		this.estrategia.getCola(this.elementos).agregar(o);
	}
	
	@Override
	public Object obtener(){
		//le doy mi cola de colas a la estrategia (azar o intercalado)
		//con su criterio, me devuelve una cola
		//agrego en ella
				
		return this.estrategia.getCola(this.elementos).obtener();
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
	
	public void setEstrategia(Estrategia e){
		this.estrategia=e;
	}
}
