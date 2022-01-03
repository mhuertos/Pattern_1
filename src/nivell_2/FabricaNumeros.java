package nivell_2;

public class FabricaNumeros extends AbstractFactory{
	
	public Dato getDato(String tipoDato) {	
		if(tipoDato.equalsIgnoreCase("NUMERO")) {
			return new Numero();
		}else if(tipoDato.equalsIgnoreCase("direccion")) {
			return new Direccion();
		}
		return null;
	}
}
