package nivell_1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instancia;
	private static ArrayList<String> commands = new ArrayList<String>();
	
	private Undo() {	
	}
	
	public static Undo getInstancia() {
		if(instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}
	
	public static void guardaComandament(String comandament) {
		commands.add(comandament);
	}
	
	public static void llistaComandament() {
		System.out.println(commands);
	}
}
