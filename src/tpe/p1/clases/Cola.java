package tpe.p1.clases;


public abstract class Cola {
	public abstract void agregar(Object o); //en ColaMultiple colas, en ColaTerminal Object's
	public abstract Object obtener();
	public abstract int getCantElementos();
	
	//
	public abstract ColaTerminal mayorColaTerminal();
	public abstract int cantColasTerminales();
	// Necesito abstraerlos para luego poder analizar todas las colas por igual
	// sin preguntarme cual es terminal y cual no.
}
