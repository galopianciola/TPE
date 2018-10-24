package tpe.p1.clases;

public class MainClass {

	public static void main(String[] args) {
		Cola cola1 = new ColaTerminal();
		Cola cola2 = new ColaTerminal();
		
		cola1.agregar(new String("A"));
		cola2.agregar(new String("A"));
		cola2.agregar(new String("B"));
		
		
		ColaMultiple colaAzar1 = new Azar();
		colaAzar1.agregarCola(cola1);
		colaAzar1.agregarCola(cola2);
		
		
		Cola cola3 = new ColaTerminal();
		Cola cola4 = new ColaTerminal();
		cola3.agregar(new String("A"));
		cola3.agregar(new String("B"));
		cola3.agregar(new String("C"));
		cola4.agregar(new String("A"));
		cola4.agregar(new String("B"));
		cola4.agregar(new String("C"));
		cola4.agregar(new String("D"));
		
		
		ColaMultiple colaIntercalado1 = new Intercalado();
		colaIntercalado1.agregarCola(colaAzar1);
		colaIntercalado1.agregarCola(cola3);
		colaIntercalado1.agregarCola(cola4);
		
		
		Cola cola5 = new ColaTerminal();
		Cola cola6 = new ColaTerminal();
		cola5.agregar(new String("A"));
		cola5.agregar(new String("B"));
		cola5.agregar(new String("C"));
		cola5.agregar(new String("D"));
		cola5.agregar(new String("E"));
		cola6.agregar(new String("A"));
		cola6.agregar(new String("B"));
		cola6.agregar(new String("C"));
		cola6.agregar(new String("D"));
		cola6.agregar(new String("E"));
		cola6.agregar(new String("F"));
		
		ColaMultiple colaAzar2 = new Azar();
		colaAzar2.agregarCola(cola5);
		colaAzar2.agregarCola(cola6);
		
		ColaMultiple colaAzar3 = new Azar();
		colaAzar3.agregarCola(colaIntercalado1);
		colaAzar3.agregarCola(colaAzar2);
		
		System.out.println("Cant elementos estructura total " + colaAzar3.getCantElementos());
		System.out.println("Cola terminal mayor " + colaAzar3.mayorColaTerminal().getCantElementos());
		System.out.println("Cant colas terminales azar3 " + colaAzar3.cantColasTerminales());
	}

}
