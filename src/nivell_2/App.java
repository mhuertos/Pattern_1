package nivell_2;

import java.util.HashMap;

public class App {
	
	public static void main(String[] args) {
		HashMap<String, String> agenda = new HashMap <String, String>();
		
		FabricaNumeros fabricaDatos = new FabricaNumeros();
		Dato telf_1 = fabricaDatos.getDato("numero");
		telf_1.write();
		
	}

}
